package com.extensions.logmonitor.jsonLogModule.jsonLogSelectParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.extensions.logmonitor.config.CommonConfig;
import com.extensions.logmonitor.jsonContentParseies.jsonAntlr4Parser.JsonContentVisitor2;
import com.extensions.logmonitor.jsonContentParseies.jsonAntlr4Parser.jsonLexer;
import com.extensions.logmonitor.jsonContentParseies.jsonAntlr4Parser.jsonParser;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.dataCache.selectDataCache.QueryResultDataItem;
import com.extensions.logmonitor.jsonLogModule.queryExecute.QueryExecutor;
import com.extensions.logmonitor.util.BatchTimeWatcher;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年10月18日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Slf4j
public class JsonLogDataQueryHandler {

	private List<QueryExecutor> queryExecutors;
	private JsonContentVisitor2 visitor;
	private MultiJsonLogDataQueryHandler handler;
	// public static BatchTimeWatcher watcher = new
	// BatchTimeWatcher(CommonConfig.watchBatchSize,
	// new BatchTimeWatcher.BatchWatchOutput() {
	// @Override
	// public void output(int batchIndex, int batchCount, int batchUseTime, long
	// preTime, long currentTime) {
	// System.out.println("doInWalkers\t" + batchIndex + "\thandle " +
	// batchCount + " visit use all time:"
	// + batchUseTime + "\t" + (batchCount / (batchUseTime)) + " visit/ms");
	// }
	// });

	public JsonLogDataQueryHandler(List<QueryExecutor> queryExecutors) {
		this.queryExecutors = queryExecutors;
		this.visitor = new JsonContentVisitor2(queryExecutors);
		this.handler = new MultiJsonLogDataQueryHandler(this);
		this.handler.startWork();
	}

	public void wirteString(String lineLog) {
		this.handler.writeString(lineLog);
	}

	public void doHandle(String lineLog) {
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(lineLog.trim().getBytes());
			// 词语、语法解析，生成抽象语法树
			ANTLRInputStream input = new ANTLRInputStream(bais);
			jsonLexer lexer = new jsonLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			jsonParser parser = new jsonParser(tokens);
			ParseTree tree = parser.jsonFile();
			visitor.visit(tree);
			bais.reset();
		} catch (IOException e) {
			log.info("can not parse str:{}", lineLog);
		}
	}

	public Map<QueryExecutor, List<Map<String, Object>>> doAnalyzerResult() {
		this.handler.over();
		Map<QueryExecutor, List<Map<String, Object>>> retMap = new HashMap<>();
		for (QueryExecutor qe : this.queryExecutors) {
			System.out.println("\nfor logEventType:" + qe.getFromTableLogName() + "handle results are:");
			List<QueryResultDataItem> doHandle = qe.doHandle();
			List<Map<String, Object>> retLines = new ArrayList<>();
			for (QueryResultDataItem qrdi : doHandle) {
				retLines.add(qrdi.getQueryResult());
			}
			retMap.put(qe, retLines);
		}
		return retMap;
	}

	/**
	 * @param take
	 */
	public void visitTree(ParseTree tree) {
		visitor.visit(tree);
	}

}
