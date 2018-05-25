package com.extensions.logmonitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.extensions.logmonitor.jsonLogModule.queryExecute.QueryExecutor;
import com.extensions.logmonitor.util.JacksonUtil;

public class MultiLogAnalyzerResult {

	private Map<QueryExecutor, List<Map<String, Object>>> logEventTypeResultMaps = new HashMap<>();

	public List<Map<String, Object>> getResult(QueryExecutor qe) {
		return this.logEventTypeResultMaps.get(qe);
	}

	public void addResult(Map<QueryExecutor, List<Map<String, Object>>> logEventTypeResultMaps) {
		this.logEventTypeResultMaps = logEventTypeResultMaps;
	}

	public String toString() {
		return JacksonUtil.obj2Str(logEventTypeResultMaps.values());
	}

}
