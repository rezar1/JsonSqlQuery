package com.extensions.logmonitor.main.output;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月16日 上午10:45:20
 * @Desc 些年若许,不负芳华.
 *
 */
@Data
public class LineFormatParser {

	private ArrayList<String> keys;
	private String originForamt;
	private String formatAfterHandle;

	public LineFormatParser(String formatStr) {
		this.originForamt = formatStr;
		String pattern = "\\$\\{(.*?)\\}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(formatStr);
		this.keys = new ArrayList<>();
		while (matcher.find()) {
			String group = matcher.group(1);
			keys.add(group);
		}
		this.formatAfterHandle = formatStr.replaceAll("\\$\\{(.*?)\\}", "%s");
	}

	public String formatLineStr(Map<String, Object> lineData) {
		Object[] params = takeParams(lineData);
		String ret = String.format(this.formatAfterHandle, params);
		params = null;
		return ret;
	}

	/**
	 * @param lineData
	 * @return
	 */
	private Object[] takeParams(Map<String, Object> lineData) {
		Object[] params = new Object[this.keys.size()];
		for (int index = 0; index < this.keys.size(); index++) {
			params[index] = lineData.get(this.keys.get(index));
		}
		return params;
	}

}
