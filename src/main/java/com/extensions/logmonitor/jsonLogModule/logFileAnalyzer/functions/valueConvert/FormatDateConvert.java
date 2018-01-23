package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.functions.valueConvert;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年1月23日
 * @Desc this guy is too lazy , noting left.
 *
 */
public class FormatDateConvert implements ValueConvert {

	private String timeFormat = "yyyy-MM-dd HH:mm:ss.SSS";

	@Override
	public Object convert(Object value) {
		if (value == null || !(value instanceof Number)) {
			return value;
		}
		SimpleDateFormat format = new SimpleDateFormat(timeFormat);
		long longValue = ((Number) value).longValue();
		return format.format(new Date(longValue));
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

}
