package com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.order;

import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.functions.valueConvert.ValueConvert;

import lombok.Data;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年9月9日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Data
public class OrderByItem {

	private String orderByPath;
	private OrderType orderType;
	private ValueConvert valueConvert;

	public OrderByItem() {

	}

}
