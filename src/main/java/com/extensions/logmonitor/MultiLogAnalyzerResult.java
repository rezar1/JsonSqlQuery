package com.extensions.logmonitor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiLogAnalyzerResult {

	private Map<String, List<Map<String, Object>>> logEventTypeResultMaps = new HashMap<>();

	public List<Map<String, Object>> getResult(String logEventType) {
		return this.logEventTypeResultMaps.get(logEventType);
	}

	public void addResult(String logEventType, List<Map<String, Object>> result) {
		this.logEventTypeResultMaps.put(logEventType, result);
	}

}
