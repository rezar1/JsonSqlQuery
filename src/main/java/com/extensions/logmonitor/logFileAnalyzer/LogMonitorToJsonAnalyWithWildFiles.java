package com.extensions.logmonitor.logFileAnalyzer;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.filefilter.WildcardFileFilter;
import org.apache.commons.lang.time.StopWatch;

import com.extensions.kienerj.OptimizedRandomAccessFile;
import com.extensions.logmonitor.config.CommonConfig;
import com.extensions.logmonitor.config.LogJsonAnalyzer;
import com.extensions.logmonitor.jsonLogModule.jsonLogSelectParser.JsonLogDataQueryHandler;
import com.extensions.logmonitor.main.output.ResultPrint;
import com.extensions.logmonitor.processors.FilePointer;
import com.extensions.logmonitor.processors.FilePointerProcessor;
import com.extensions.logmonitor.util.BatchTimeWatcher;
import com.extensions.logmonitor.util.GenericsUtils;
import com.extensions.logmonitor.util.LogMonitorUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月13日 下午3:25:15
 * @Desc 些年若许,不负芳华.
 *
 */
@Slf4j
public class LogMonitorToJsonAnalyWithWildFiles {

	private FilePointerProcessor filePointerProcessor;
	private LogJsonAnalyzer logJsonAnalyzer;
	private static final StopWatch watch = new StopWatch();

	public LogMonitorToJsonAnalyWithWildFiles(FilePointerProcessor filePointerProcessor,
			LogJsonAnalyzer logJsonAnalyzer) {
		this.filePointerProcessor = filePointerProcessor;
		this.logJsonAnalyzer = logJsonAnalyzer;
	}

	public void call(ResultPrint resultPrint) throws Exception {
		String dirPath = resolveDirPath(logJsonAnalyzer.getLogDirectory());
		log.info("Log monitor task started...");
		OptimizedRandomAccessFile randomAccessFile = null;
		long curFilePointer = 0;
		List<File> files = getLogFile(dirPath);
		if (GenericsUtils.isNullOrEmpty(files)) {
			log.info("empty files for dir:{} with jsonLogName:{}", dirPath, logJsonAnalyzer.getLogName());
			return;
		}
		for (File file : files) {
			try {
				randomAccessFile = new OptimizedRandomAccessFile(file, "r");
				long fileSize = randomAccessFile.length();
				String dynamicLogPath = dirPath + logJsonAnalyzer.getLogName();
				curFilePointer = getCurrentFilePointer(dynamicLogPath, file.getPath(), fileSize);
				randomAccessFile.seek(curFilePointer);
				String currentLine = null;
				watch.start();
				watch.split();
				while ((currentLine = randomAccessFile.readLine()) != null) {
					handleLine(currentLine, curFilePointer);
					curFilePointer = randomAccessFile.getFilePointer();
				}
				watch.split();
				log.info("scan all lines use:" + watch.getSplitTime() + " ms");
				setNewFilePointer(dynamicLogPath, file.getPath(), curFilePointer);
				log.info(String.format("Successfully processed log file [%s] -- %s", file.getPath(), curFilePointer));
			} finally {
				LogMonitorUtil.closeRandomAccessFile(randomAccessFile);
			}
		}
		try {
			resultPrint.before();
			analyzerQuery();
		} catch (Exception e) {
		} finally {
			resultPrint.end();
		}
	}

	/**
	 * 
	 */
	private void analyzerQuery() {
		Set<String> allHandleLogEventTypes = this.logJsonAnalyzer.getAllHandleLogEventTypes();
		for (String logEventType : allHandleLogEventTypes) {
			JsonLogDataQueryHandler findJsonLogDataQueryHandler = this.logJsonAnalyzer
					.findJsonLogDataQueryHandler(logEventType);
			findJsonLogDataQueryHandler.doAnalyzerResult();
		}
	}

	/**
	 * @param logMetrics
	 * 
	 */
	public void analyzerQuery(ResultPrint resultPrint) {
		Set<String> allHandleLogEventTypes = this.logJsonAnalyzer.getAllHandleLogEventTypes();
		for (String logEventType : allHandleLogEventTypes) {
			JsonLogDataQueryHandler findJsonLogDataQueryHandler = this.logJsonAnalyzer
					.findJsonLogDataQueryHandler(logEventType);
			findJsonLogDataQueryHandler.doAnalyzerResult(resultPrint);
		}
	}

	public static void main(String[] args) {
		String currentLine = "{\"LogEventType\":\"AdReqLog\"}";
		int indexOf = currentLine.indexOf("\"LogEventType\":");
		if (indexOf == -1) {
			return;
		}
		String logEventTypeStr = currentLine.substring(indexOf + 16, currentLine.indexOf("\"", indexOf + 17));
		System.out.println(logEventTypeStr);
	}

	private BatchTimeWatcher watcher = new BatchTimeWatcher(CommonConfig.watchBatchSize,
			new BatchTimeWatcher.BatchWatchOutput() {
				@Override
				public void output(int batchIndex, int batchCount, int batchUseTime, long preTime, long currentTime) {
					System.out.println("wirteString\t" + batchIndex + "\thandle " + batchCount + " line use all time:"
							+ batchUseTime + "\t" + (batchCount / (batchUseTime)) + " l/ms");
				}
			});

	/**
	 * @param currentLine
	 * @param curFilePointer
	 */
	private void handleLine(String currentLine, long curFilePointer) {
		String letMark = "let\":\"";
		int indexOf = currentLine.indexOf(letMark);
		if (indexOf != -1 || CommonConfig.defaultLogEventType != null) {
			String logEventTypeStr = null;
			if (indexOf != -1) {
				int beginIndex = indexOf + letMark.length();
				logEventTypeStr = currentLine.substring(beginIndex, currentLine.indexOf("\"", beginIndex + 1));
			} else if (currentLine.startsWith("{")) {
				logEventTypeStr = CommonConfig.defaultLogEventType;
			} else {
				return;
			}
			JsonLogDataQueryHandler jsonLogDataQueryHandler = this.logJsonAnalyzer
					.findJsonLogDataQueryHandler(logEventTypeStr);
			if (jsonLogDataQueryHandler != null) {
				watcher.countSingleTimeStart();
				jsonLogDataQueryHandler.wirteString(currentLine);
				watcher.countSingleTimeEnd();
			}
		}
	}

	private List<File> getLogFile(String dirPath) throws FileNotFoundException {
		File directory = new File(dirPath);
		List<File> needMonitorFiles = new ArrayList<File>();
		if (directory.isDirectory()) {
			FileFilter fileFilter = new WildcardFileFilter(logJsonAnalyzer.getLogName());
			File[] files = directory.listFiles(fileFilter);
			if (files != null && files.length > 0) {
				for (File logFile : files) {
					if (!logFile.canRead()) {
						log.debug(String.format("Unable to read file [%s]", logFile.getPath()));
					}
					needMonitorFiles.add(logFile);
				}
			} else {
				throw new FileNotFoundException(String.format("Unable to find any file with name [%s] in [%s]",
						logJsonAnalyzer.getLogName(), dirPath));
			}
		} else {
			throw new FileNotFoundException(
					String.format("Directory [%s] not found. Ensure it is a directory.", dirPath));
		}
		return needMonitorFiles;
	}

	private String resolveDirPath(String confDirPath) {
		String resolvedPath = LogMonitorUtil.resolvePath(confDirPath);
		if (!resolvedPath.endsWith(File.separator)) {
			resolvedPath = resolvedPath + File.separator;
		}
		return resolvedPath;
	}

	private long getCurrentFilePointer(String dynamicLogPath, String actualLogPath, long fileSize) {
		FilePointer filePointer = filePointerProcessor.getFilePointer(dynamicLogPath, actualLogPath);
		long currentPosition = filePointer.getLastReadPosition().get();
		if (isFilenameChanged(filePointer.getFilename(), actualLogPath) || isLogRotated(fileSize, currentPosition)) {
			if (log.isDebugEnabled()) {
				log.debug("Filename has either changed or rotated, resetting position to 0");
			}
			currentPosition = 0;
		}
		return currentPosition;
	}

	private boolean isLogRotated(long fileSize, long startPosition) {
		return fileSize < startPosition;
	}

	private boolean isFilenameChanged(String oldFilename, String newFilename) {
		return !oldFilename.equals(newFilename);
	}

	private void setNewFilePointer(String dynamicLogPath, String actualLogPath, long lastReadPosition) {
		filePointerProcessor.updateFilePointer(dynamicLogPath, actualLogPath, lastReadPosition);
	}

}
