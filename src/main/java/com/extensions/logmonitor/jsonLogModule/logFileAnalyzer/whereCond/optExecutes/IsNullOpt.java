package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.optExecutes;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月6日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class IsNullOpt extends OptExecuteCommon<Object> {

	public IsNullOpt(Object matchValue) {
		super(matchValue);
	}

	@Override
	protected String getOptType() {
		return isNull;
	}

}
