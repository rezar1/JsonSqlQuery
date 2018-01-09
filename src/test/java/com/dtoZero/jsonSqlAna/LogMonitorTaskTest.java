package com.dtoZero.jsonSqlAna;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.extensions.logmonitor.config.CommonConfig;
import com.extensions.logmonitor.config.LogJsonAnalyzer;
import com.extensions.logmonitor.config.SearchInfo;
import com.extensions.logmonitor.jsonContentParseies.jsonContentAnalyzer.NeedParsePathMatcher;
import com.extensions.logmonitor.jsonLogModule.jsonLogSelectParser.JsonLogQuerySqlParser;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.OptExecute;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.WhereCondition;
import com.extensions.logmonitor.jsonLogModule.queryExecute.QueryExecutor;
import com.extensions.logmonitor.logFileAnalyzer.LogMonitorTaskForJsonAnalyzer;
import com.extensions.logmonitor.processors.FilePointer;
import com.extensions.logmonitor.processors.FilePointerProcessor;

@RunWith(MockitoJUnitRunner.class)
public class LogMonitorTaskTest {

	@Mock
	private FilePointerProcessor mockFilePointerProcessor;

	public static String btreeFile = "/Users/rezar/Desktop/12";

	public static void main(String[] args) {
		String Str = "\"LogEventType\":\"Sa_Req\",\"request\"";
		int indexOf = Str.indexOf("LogEventType");
		System.out.println("logEventTypeStr indexOf:" + indexOf);
		if (indexOf == -1) {
			return;
		}
		String logEventTypeStr = Str.substring(indexOf + 15, Str.indexOf("\"", indexOf + 17));
		System.out.println(logEventTypeStr);
	}

	@Test
	public void testWhereFunCall() throws Exception {
		String selectQuery = "select * from user_info where hour('yyyy-MM-dd HH:mm:ss',time) between 10 and 23";
		QueryExecutor queryExecutor = JsonLogQuerySqlParser.createQueryExecutor(selectQuery);
		WhereCondition whereCondition = queryExecutor.getWhereCondition();
		Map<NeedParsePathMatcher, List<OptExecute>> optExecuteQuickVisitCache2 = whereCondition
				.getOptExecuteQuickVisitCache2();
		System.out.println("optExecuteQuickVisitCache2:" + optExecuteQuickVisitCache2);
		List<OptExecute> findOptExecutes = whereCondition.findOptExecutes("time");
		System.out.println("findOptExecutes are:" + findOptExecutes);
		Map<OptExecute, Boolean> optResult = new HashMap<>();
		for (OptExecute opt : findOptExecutes) {
			boolean optSuccess = opt.OptSuccess("2017-12-12 14:23:10");
			optResult.put(opt, optSuccess);
		}
		System.out.println("checkWhereIsSuccess:" + whereCondition.checkWhereIsSuccess(optResult));
	}

	@Test
	public void testRandom() throws Exception {
		String logDirectory = "/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles";
		String logName = "test.log";
		CommonConfig.watchBatchSize = 10000;
		CommonConfig.defaultLogEventType = "testJson";
		FilePointer filePointer = new FilePointer();
		filePointer.setFilename(logDirectory + logName);
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog",
				"/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles", "test.log");
		SearchInfo searchInfo = new SearchInfo("select age from testJson where random() <= 0.9");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
	}

	@Test
	public void testJsonArrayAnalyzer() throws Exception {
		String logDirectory = "/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles";
		String logName = "test.log";
		CommonConfig.watchBatchSize = 10000;
		CommonConfig.defaultLogEventType = "testJson";
		FilePointer filePointer = new FilePointer();
		filePointer.setFilename(logDirectory + logName);
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog",
				"/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles", "test.log");
		SearchInfo searchInfo = new SearchInfo(
				"select subUserInfos[*].adslotId as allAdslotId from testJson where subUserInfos[*].adslotId in (35708115,71496005)");
		// searchInfo = new SearchInfo(
		// "select subUserInfos[*].adslotId as allAdslotId from testJson where
		// name = 'Rezar1999884193'");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
	}

	@Test
	public void testJsonAnalyzer() throws Exception {
		String logDirectory = "/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles";
		String logName = "test.log";
		FilePointer filePointer = new FilePointer();
		filePointer.setFilename(logDirectory + logName);
		CommonConfig.defaultLogEventType = "testJson";
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog",
				"/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles", "test.log");
		// SearchInfo searchInfo = new SearchInfo(
		// "select name,age,sum(age) as ageSum ,count(age) as ageCount from
		// testJson where age between 50 and 95 group by age");
		SearchInfo searchInfo = new SearchInfo(
				"select distinct regex_group('(\\d{4}-\\d{2}-\\d{2}) (\\d{2}:?)+ \\d{3}',1,time) as timeOfDay,age from testJson where age between 50 and 95 order by day('yyyy-MM-dd HH:mm:ss SSS',time) desc , age desc limit 0,100");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
		/**
		 * 
		 * 优化记录:
		 * 
		 * 1.10000000:14:28:37:444 --> 14:40:14:232 --->maxHeapSize:xxx
		 * 2.10000000:15:04:26:809 --> 15:16:37:519 --->maxHeapSize:-》900M
		 * (修改了orderByDataItem的数据orderTypes --> comparator)
		 * 3.10000000:18:39:46:006 --> 18:51:40:616 --->maxHeapSize:-》800M
		 * (修改了orderByDataItemWithUnicode作为比较的数据,不再引用原始比较对象,比较对象的unicode大小，PS:这样无效,对于字符串无法通过16进制unicode的和来进行比较)
		 * 4.10000000:18:23:58:611 --> 18:34:08:534 <br/>
		 * 5.10000000:16:37:11:042 --> 16:38:00:210 --->maxHeapSize:150M
		 * (修改了查询结果的存储,直接按顺序存储到结果文件里面) <br/>
		 * 6.10000000: 17:42:25:908 --> 17:50:13:457 435129 ms
		 * --->maxHeapSize:500M --》select name,age from testJson where age
		 * between 50 and 95 order by age desc,这个最优目前
		 * 
		 * 7.10000000： 439816 ms <br/>
		 * select name,age from testJson where age between 50 and 95 order by
		 * age desc <br/>
		 * 减少中间对象的创建(修改了批量antlr文本处理)
		 * 
		 */
	}

	@Test
	public void testJsonFunAnalyzer() throws Exception {
		CommonConfig.watchBatchSize = 10000;
		String logDirectory = "/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles";
		String logName = "test.log";
		FilePointer filePointer = new FilePointer();
		filePointer.setFilename(logDirectory + logName);
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog",
				"/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles", "test2.log");
		SearchInfo searchInfo = new SearchInfo(
				"select app_id,hour('yyyy-MM-dd HH:mm:ss.SSSZ',timestamp) as timeOfHour,count(app_id) as appVisitCount from Sa_Req where isSdk=false  group by app_id,timeOfHour order by app_id asc , timeOfHour asc");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
		/**
		 * sql:select day('yyyy-MM-dd HH:mm:ss SSS',time) as
		 * dayOfTime,hour('yyyy-MM-dd HH:mm:ss SSS',time) as
		 * hourOfDay,count(age) as ageCount from testJson where age between 50
		 * and 95 group by dayOfTime,hourOfDay
		 * 
		 * 100000000 use time 217969 ms
		 */
	}

	@Test
	public void testJsonGrupAnalyzer() throws Exception {
		String logDirectory = "/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles";
		String logName = "test.log";
		FilePointer filePointer = new FilePointer();
		CommonConfig.defaultLogEventType = "testJson";
		CommonConfig.watchBatchSize = 1000000;
		filePointer.setFilename(logDirectory + logName);
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog",
				"/Users/rezar/RezarWorkSpace/eclipseWorkSpcae/log/logFiles", "test.log");
		SearchInfo searchInfo = new SearchInfo(
				"select regex_group('(\\d{4}-\\d{2}-\\d{2}) (\\d{2}:?)+ \\d{3}',1,time) as timeOfDay,hour('yyyy-MM-dd HH:mm:ss SSS',time) as hourOfDay,count(age) as ageCount from testJson where age between 50 and 95 group by timeOfDay,hourOfDay order by timeOfDay desc,hourOfDay desc");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
		/**
		 * sql:select day('yyyy-MM-dd HH:mm:ss SSS',time) as
		 * dayOfTime,hour('yyyy-MM-dd HH:mm:ss SSS',time) as
		 * hourOfDay,count(age) as ageCount from testJson where age between 50
		 * and 95 group by dayOfTime,hourOfDay
		 * 
		 * 100000000 use time 217969 ms
		 */
	}

	@Test
	public void testLogAna() throws Exception {
		String logDirectory = "/Users/rezar/Desktop/";
		String logName = "adReqFilter.log";
		FilePointer filePointer = new FilePointer();
		filePointer.setFilename(logDirectory + logName);
		when(mockFilePointerProcessor.getFilePointer(anyString(), anyString())).thenReturn(filePointer);
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer("TestLog", "/Users/rezar/Desktop/", "adReqFilter2.log");
		SearchInfo searchInfo = new SearchInfo(
				"select code,score,appInfo.ip as ip ,appInfo.imei as imei ,appInfo.android_id as android_id,appInfo.idfa as idfa,appInfo.app_id as app_id ,appInfo.ad_slot_id as ad_slot_id from requestFilter where code!= '0' order by appInfo.app_id asc , appInfo.ad_slot_id asc");
		logJsonAnalyzer.addSearchInfo(searchInfo);
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(mockFilePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
	}

}
