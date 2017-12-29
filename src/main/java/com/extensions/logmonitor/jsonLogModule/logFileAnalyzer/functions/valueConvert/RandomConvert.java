package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.functions.valueConvert;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年12月28日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class RandomConvert implements ValueConvert {

	@Override
	public Object convert(Object value) {
		return Math.random();
	}

}
