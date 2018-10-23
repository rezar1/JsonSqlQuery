package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.group;

import com.extensions.logmonitor.util.GenericsUtils;
import com.extensions.logmonitor.util.StrUtils;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月11日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class GroupByKey {

	// private List<Object> values = new ArrayList<>();
	@SuppressWarnings("unused")
	private String hashValue = "";
	private StringBuilder hashValueBuilder = new StringBuilder();

	public GroupByKey addGroupByFieldValue2(Object value) {
		// values.add(value);
		String hexValue = null;
		if (value instanceof Integer) {
			hexValue = Integer.toHexString((int) value);
		} else if (value instanceof Double) {
			hexValue = Double.toHexString((double) value);
		} else if (value instanceof String) {
			hexValue = StrUtils.makeChecksum(StrUtils.convert((String) value));
		} else if (value == null) {
			hexValue = "FFFF";
		} else {
			System.out.println("not support!!!");
		}
		this.hashValue += (hexValue);
		return this;
	}

	public GroupByKey addGroupByFieldValue(Object value) {
		this.hashValueBuilder.append(value == null ? "" : value.toString()).append("_");
		return this;
	}

	public Long getHashValue() {
		return (long) GenericsUtils.deleteLastChar(hashValueBuilder).hashCode();
	}

	// public List<Object> getValues() {
	// return this.values;
	// }

}
