package com.extensions.logmonitor.main.output;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.UUID;

import com.extensions.logmonitor.config.CommonConfig;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.dataCache.selectDataCache.QueryResultDataItem;
import com.extensions.logmonitor.main.JSqlComandLineOptions;
import com.extensions.logmonitor.util.GenericsUtils;
import com.extensions.logmonitor.util.JacksonUtil;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月15日 下午7:52:05
 * @Desc 些年若许,不负芳华.
 *
 */
@Data
@Slf4j
public class TextResultPrint implements ResultPrint {

	private String outputToFilePath;
	private boolean append;
	private boolean sysOutput;
	private String jsonOutputEventType;
	private boolean jsonLine;
	private String originLineFormat;
	private LineFormatParser lineFormatParser;

	private PrintWriter pw;

	@Override
	public void before(JSqlComandLineOptions options) {
		this.setAppend(Boolean.parseBoolean(options.getAppend()));
		this.setJsonLine(Boolean.parseBoolean(options.getJsonOutput()));
		this.setJsonOutputEventType(options.getLogEvent());
		this.setOriginLineFormat(options.getFormatStr());
		this.setOutputToFilePath(options.getFileOutput());
		this.setSysOutput(Boolean.parseBoolean(options.getSysOutput()));
		this.originLineFormat = options.getFormatStr();
		if (GenericsUtils.notNullAndEmpty(this.originLineFormat)) {
			this.lineFormatParser = new LineFormatParser(this.originLineFormat);
		}
		OutputStream os = null;
		if (GenericsUtils.notNullAndEmpty(this.outputToFilePath)) {
			os = initOutputFile(this.outputToFilePath);
		} else if (!sysOutput) {
			os = initOutputFile(CommonConfig.tempFilePath + File.pathSeparator
					+ (UUID.randomUUID().toString().replaceAll("-", "")) + ".txt");
		} else {
			os = System.out;
		}
		this.pw = new PrintWriter(os, true);
	}

	/**
	 * @param os
	 * @return
	 */
	private OutputStream initOutputFile(String outputToFilePath) {
		File file = this.validFilePath(outputToFilePath);
		try {
			return new BufferedOutputStream(new FileOutputStream(file, append));
		} catch (Exception e) {
			log.error("error:{}", e);
		}
		return null;
	}

	@Override
	public void resultPrint(QueryResultDataItem resultItem) {
		String lineData = "";
		LinkedHashMap<String, Object> queryResult = resultItem.getQueryResult();
		if (this.jsonLine) {
			if (GenericsUtils.notNullAndEmpty(this.jsonOutputEventType)) {
				queryResult.put("let", this.jsonOutputEventType);
			}
			lineData = JacksonUtil.obj2Str(queryResult);
		} else {
			if (this.lineFormatParser != null) {
				lineData = this.lineFormatParser.formatLineStr(queryResult);
			} else {
				lineData = queryResult.toString();
			}
		}
		this.pw.println(lineData);
	}

	@Override
	public void end() {
		this.pw.close();
	}

	/**
	 * @param outputToFilePath2
	 * @return
	 */
	private File validFilePath(String outputToFilePath) {
		File file = new File(outputToFilePath);
		if (!file.exists()) {
			if ((file.getParentFile() == null || !file.getParentFile().exists())) {
				throw new IllegalArgumentException(String.format("outputFile:%s illegal", outputToFilePath));
			} else {
				try {
					file.createNewFile();
				} catch (IOException e) {
					throw new IllegalArgumentException(
							String.format("error createNewFile with outputFile:%s", outputToFilePath), e);
				}
			}
		}
		return file;
	}
}
