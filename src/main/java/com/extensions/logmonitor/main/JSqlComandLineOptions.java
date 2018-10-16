package com.extensions.logmonitor.main;

import java.util.List;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月13日 下午4:10:26
 * @Desc 些年若许,不负芳华.
 *
 */
@Data
@Parameters(commandNames = { "jsonQuery" }, separators = "=", commandDescription = "json 日志分析")
public class JSqlComandLineOptions {

	@JsonIgnore
	@Parameter(names = { "--help", "-h" }, help = true)
	private boolean help;
	@Parameter(names = { "-dir", "-d" }, description = "日志文件所在的目录,默认为当前目录下", required = false)
	private String dir;
	@Parameter(names = { "-p" }, description = "检索日志文件名称的正则表达式,e.g. *testFile.log", required = true)
	private String filePattern;
	@Parameter(names = { "-jsql" }, description = "日志检索的json(jsql语句请用双引号括起来),支持多个-jsql属性", required = true)
	private List<String> jsonSql;
	@Parameter(names = { "-f" }, description = "结果输出到文件,输入文件路径", required = false)
	private String fileOutput;
	@Parameter(names = { "-sys" }, description = "结果控制台打印?", required = false)
	private boolean sysOutput = true;
	@Parameter(names = { "-a" }, description = "结果文件打印是否追加?", required = false)
	private boolean append = false;
	@Parameter(names = { "-j" }, description = "json格式打印?", required = false)
	private boolean jsonOutput;
	@Parameter(names = { "-l" }, description = "json格式打印的时候补加logEventType", required = false)
	private String logEvent;
	@Parameter(names = {
			"-fmt" }, description = "格式化输出内容, e.g.文件:${fileName},ip:${ip} -- 请求数量:${num}\n ", required = false)
	private String formatStr;

}
