package com.extensions.logmonitor.main.output;

import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.dataCache.selectDataCache.QueryResultDataItem;
import com.extensions.logmonitor.main.JSqlComandLineOptions;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年11月6日
 * @Desc this guy is to lazy , noting left.
 *
 */
public interface ResultPrint {

	public void before(JSqlComandLineOptions options);

	public void resultPrint(QueryResultDataItem resultItem);

	public void end();

}
