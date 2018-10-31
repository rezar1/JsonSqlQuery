package com.dtoZero.jsonSqlAna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.OptExecute;
import com.extensions.logmonitor.jsonLogModule.logFileAnalyzer.whereCond.optExecutes.EqOpt;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月31日 下午7:32:18
 * @Desc 些年若许,不负芳华.
 *
 */
public class OptExecuteTest {

	private static Object valueConvert;
	private static boolean isArray;

	public static void main(String[] args) {
		int times = 10000000;
		List<EqOpt> opts = new ArrayList<>();
		OptExecute o1 = new EqOpt("xixix");
		OptExecute o2 = new EqOpt("fxixix");
		OptExecute o3 = new EqOpt("xgixix");
		// opts.add(new EqOpt("9999"));
		// opts.add(new EqOpt("12456"));
		Map<Integer, Object> adReqFilterInfoFieldValueMap = new HashMap<>();
		adReqFilterInfoFieldValueMap.put(0, "fdsfds");
		adReqFilterInfoFieldValueMap.put(1, "fff");
		adReqFilterInfoFieldValueMap.put(0, "fdsfds");
		long time = System.currentTimeMillis();
		// 9701 optUserTime:5337 qps:1030.82
		long optUserTime = 0;
		Object value = "xxxx";
		Object matchValue = "hhhhh";
		TestHelper helper = new TestHelper();
		for (int i = 0; i < times; i++) {
			for (int index = 0; index < opts.size(); index++) {
				Object object = adReqFilterInfoFieldValueMap.get(index);
				OptExecute optExecute = opts.get(index);
				long time1 = System.currentTimeMillis();
				optExecute.OptSuccess(object);
				long time2 = System.currentTimeMillis();
				optUserTime += (time2 - time1);
			}
		}
		long time2 = System.currentTimeMillis();
		System.out.println("userTime:" + (time2 - time) + " optUserTime:" + optUserTime);
	}

}
