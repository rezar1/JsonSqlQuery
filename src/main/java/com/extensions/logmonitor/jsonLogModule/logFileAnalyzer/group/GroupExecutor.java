package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.extensions.logmonitor.jsonContentParseies.jsonContentAnalyzer.ExecuteLazy;
import com.extensions.logmonitor.jsonContentParseies.jsonContentAnalyzer.NeedParsePathMatcher;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.dataCache.selectDataCache.QueryResultDataItem;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.select.QueryExecute;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.OptExecute;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.WhereCondition;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.optExecutes.EqOpt;
import com.extensions.logmonitor.util.GenericsUtils;
import com.extensions.logmonitor.util.TupleUtil;
import com.extensions.logmonitor.util.TwoTuple;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月8日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Slf4j
public class GroupExecutor {

	// 系统配置
	private List<GroupByItem> groupByPaths = new ArrayList<>();
	private WhereCondition groupWhereCondition;
	// 针对列上的分组函数
	private Map<String, List<QueryExecute<? extends Object>>> havingGroupFunQuery = new HashMap<>();
	// 针对列上的分组函数2
	private Map<OptExecute, QueryExecute<? extends Object>> havingOptExecuteToQueryMapper = new HashMap<>();
	private boolean needHaving;

	private GroupFilter groupFilter = new BtreeGroupFilter();

	/**
	 * @param antrlParseFieldPaths
	 */
	public void fillParseFieldPaths(Set<String> antrlParseFieldPaths) {
		for (GroupByItem gb : this.groupByPaths) {
			antrlParseFieldPaths.add(gb.getGroupByPath());
		}
		antrlParseFieldPaths.addAll(havingGroupFunQuery.keySet());
	}

	/**
	 * @param queryReusltDataItem
	 */
	public void doHaving(QueryResultDataItem queryReusltDataItem) {
		if (!this.needHaving) {
			return;
		}
		Map<OptExecute, Boolean> optExecuteResult = new HashMap<>();
		Map<NeedParsePathMatcher, List<OptExecute>> optExecuteQuickVisitCache = this.groupWhereCondition
				.getOptExecuteQuickVisitCache2();
		for (List<OptExecute> optExecutes : optExecuteQuickVisitCache.values()) {
			for (OptExecute optExecute : optExecutes) {
				Object value = this.havingOptExecuteToQueryMapper.get(optExecute).end(queryReusltDataItem.getGroupId());
				boolean optSuccess = checkOptExecuteForGroupCondition(optExecute, value);
				log.debug("optExecuteType:{} optExecute :{} and value:{} and optSuccess:{}",
						optExecute.getClass().getSimpleName(), optExecute, value, optSuccess);
				optExecuteResult.put(optExecute, optSuccess);
			}
		}
		boolean checkWhereIsSuccess = this.groupWhereCondition.checkWhereIsSuccess(optExecuteResult);
		this.groupFilter.havingResult(queryReusltDataItem.getGroupId(), !checkWhereIsSuccess);
	}

	/**
	 * @param optExecute
	 * @param value
	 * @return
	 */
	private boolean checkOptExecuteForGroupCondition(OptExecute optExecute, Object value) {
		boolean optSuccess = optExecute.OptSuccess(value);
		if (!(optExecute instanceof EqOpt)) {
			return !optSuccess;
		}
		return optSuccess;
	}

	public TwoTuple<Boolean, Long> putQueryResultDataItem(QueryResultDataItem queryResultDataItem) {
		Map<String, Object> queryResult = queryResultDataItem.getQueryResult();
		GroupByKey gb = new GroupByKey();
		//group by 里面的字段一定需要包含在select 列表里面
		for (GroupByItem groupByItem : this.groupByPaths) {
			Object object = queryResult.get(groupByItem.getGroupByPath());
			if (groupByItem.getValueConvert() != null) {
				object = groupByItem.getValueConvert().convert(object);
			}
			gb.addGroupByFieldValue(object);
		}
		Long groupId = gb.getHashValue();
		GroupIdContact groupIdContact = null;
		boolean isHasExists = false;
		groupIdContact = this.groupFilter.findGroupIdContact(groupId);
		isHasExists = groupIdContact != null;
		if (!isHasExists) {
			groupIdContact = new GroupIdContact(queryResultDataItem.getRecordId());
			this.groupFilter.initGroupId(groupId, groupIdContact);
		}
		return TupleUtil.tuple(isHasExists, gb.getHashValue());
	}

	public void doWhereConditionQuery(QueryResultDataItem queryReusltDataItem, List<ExecuteLazy> executeLazys) {
		for (ExecuteLazy executeLazy : executeLazys) {
			executeLazy.duQuery(queryReusltDataItem);
		}
	}

	/**
	 * 添加分组项
	 * 
	 * @param groupByItem
	 * @return
	 */
	public GroupExecutor addOrderByItem(GroupByItem groupByItem) {
		groupByPaths.add(groupByItem);
		return this;
	}

	public GroupExecutor addGroupByCondition(WhereCondition whereCondition) {
		this.groupWhereCondition = whereCondition;
		return this;
	}

	public WhereCondition getGroupByCondition() {
		return this.groupWhereCondition;
	}

	public List<GroupByItem> getGroupByItem() {
		return this.groupByPaths;
	}

	public void addGroupFunQuery(OptExecute optExecute, QueryExecute<? extends Object> queryExecute) {
		this.havingOptExecuteToQueryMapper.put(optExecute, queryExecute);
		GenericsUtils.addListIfNotExists(this.havingGroupFunQuery, queryExecute.getQueryPathWithFieldName(),
				queryExecute);
	}

	/**
	 * @param superPath
	 * @return
	 */
	public List<QueryExecute<? extends Object>> getFunExecuteWithSuperPath(String superPath) {
		return havingGroupFunQuery.get(superPath);
	}

	/**
	 * @return
	 */
	public Map<Long, Boolean> getHavingFilter() {
		return this.groupWhereCondition == null ? null : null;
	}

	public GroupFilter getGroupFilter() {
		return this.groupFilter;
	}

	/**
	 * @param b
	 */
	public void setNeedHaving(boolean needHaving) {
		this.needHaving = true;
	}

	public boolean needHaving() {
		return this.needHaving;
	}

}
