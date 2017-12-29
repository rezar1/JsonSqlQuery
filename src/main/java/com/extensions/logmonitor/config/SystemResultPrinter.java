package com.extensions.logmonitor.config;

import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.dataCache.selectDataCache.QueryResultDataItem;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年11月6日
 * @Desc this guy is to lazy , noting left.
 *
 */
public class SystemResultPrinter implements ResultPrint {

	@Override
	public void reusltPrint(QueryResultDataItem resultItem) {
		System.out.println(resultItem.getQueryResult());
	}

}
