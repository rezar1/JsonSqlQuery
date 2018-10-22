package com.extensions.logmonitor.main.output;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.converters.IParameterSplitter;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月18日 下午7:29:38
 * @Desc 些年若许,不负芳华.
 *
 */
public class OriginStrIParameterSplitter implements IParameterSplitter {

	@Override
	public List<String> split(String value) {
		ArrayList<String> arrayList = new ArrayList<>(1);
		arrayList.add(value);
		return arrayList;
	}

}
