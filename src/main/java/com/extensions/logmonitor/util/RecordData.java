package com.extensions.logmonitor.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2017年11月17日
 * @Desc this guy is to lazy , noting left.
 *
 */
@Data
public class RecordData {

	private String code;
	private String score;
	private String imei;
	private String android_id;
	private String idfa;
	private String ip;
	private String app_id;
	private String ad_slot_id;

	public static void main(String[] args) throws IOException {
		String[] fields = new String[] { "code", "score", "imei", "android_id", "idfa", "ip", "app_id", "ad_slot_id" };
		String[] fieldValue = new String[] { "code", "score", "imei", "android_id", "idfa", "ip", "app_id",
				"ad_slot_id" };
		String fileName = "export_f.xls";
		ExcelHelper<RecordData> excelHelper = new ExcelHelper<RecordData>();
		List<RecordData> exportPos = new ArrayList<>();
		fillDatas("/Users/rezar/Desktop/res1.rs", exportPos);
		fillDatas("/Users/rezar/Desktop/result2.rs", exportPos);
		List<List<RecordData>> splitList = GenericsUtils.splitList(exportPos, 65535);

		int i = 0;
		for (List<RecordData> datas : splitList) {
			File file = new File("/Users/rezar/Desktop/result" + (i++) + ".xls");
			OutputStream out = new FileOutputStream(file);
			excelHelper.exportToExcel(out, datas, fields, fieldValue, fileName);
		}

	}

	/**
	 * @param string
	 * @param exportPos
	 * @throws IOException
	 */
	private static void fillDatas(String filePath, List<RecordData> exportPos) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;
		while ((line = br.readLine()) != null) {
			RecordData str2Obj = JacksonUtil.str2Obj(line, RecordData.class);
			exportPos.add(str2Obj);
		}
		br.close();
	}

}
