package com.extensions.logmonitor.main;

import java.io.File;
import java.util.List;

import com.beust.jcommander.JCommander;
import com.extensions.logmonitor.config.LogJsonAnalyzer;
import com.extensions.logmonitor.config.SearchInfo;
import com.extensions.logmonitor.logFileAnalyzer.LogMonitorTaskForJsonAnalyzer;
import com.extensions.logmonitor.processors.FilePointerProcessor;
import com.extensions.logmonitor.util.JacksonUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年10月12日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Slf4j
public class MainInvoke {

	private static FilePointerProcessor filePointerProcessor;

	public static void main(String[] args) throws Exception {
		JSqlComandLineOptions options = new JSqlComandLineOptions();
		JCommander jCommander = JCommander.newBuilder().programName("").addObject(options).build();
		jCommander.parse(args);
		if (options.isHelp()) {
			jCommander.usage();
			return;
		}
		log.info("JSqlComandLineOptions are:{}", JacksonUtil.obj2Str(options));
		String logDirectory = changeFileString(options.getDir());
		String dynLogName = options.getFilePattern();
		logDirectory = changeFileString(logDirectory);
		List<String> jsonSql = options.getJsonSql();
		filePointerProcessor = new FilePointerProcessor();
		LogJsonAnalyzer logJsonAnalyzer = new LogJsonAnalyzer(logDirectory, dynLogName);
		for (String jSql : jsonSql) {
			SearchInfo searchInfo = new SearchInfo(jSql);
			logJsonAnalyzer.addSearchInfo(searchInfo);
		}
		LogMonitorTaskForJsonAnalyzer analyzer = new LogMonitorTaskForJsonAnalyzer(filePointerProcessor,
				logJsonAnalyzer);
		analyzer.call();
		// FileUtils.deleteDirectory(CommonConfig.tempFilePath);
	}

	/**
	 * @param logDirectory
	 * @return
	 */
	private static String changeFileString(String filePathStr) {
		if (!filePathStr.endsWith("/")) {
			filePathStr += File.separator;
		}
		return filePathStr;
	}

}
