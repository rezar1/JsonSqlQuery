package com.extensions.logmonitor.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelHelper<T> {

	/**
	 * 
	 * @param request
	 * @param response
	 * @param data
	 *            要导出的数据
	 * @param fields
	 *            要导出的字段
	 * @param fieldValue
	 *            表头
	 * @param fileName
	 *            导出文件名称
	 */
	@SuppressWarnings("resource")
	public void exportToExcel(OutputStream out, List<T> data, String[] fields, String[] fieldValue, String fileName) {
		if (fields == null || fieldValue == null) {
			throw new RuntimeException("fields or header can't be null.");
		}
		Workbook wb = new HSSFWorkbook();
		Sheet sheet = wb.createSheet("ExportDataList");

		// Create a row and put some cells in it. Rows are 0 based.
		Row headerTitle = sheet.createRow(0);
		int index = 0;
		for (int i = 0; i < fields.length; i++) {
			Cell cell = headerTitle.createCell(index++ % fields.length);
			cell.setCellValue(fieldValue[i]);
		}

		for (int i = 0; i < data.size(); i++) {
			Row row = sheet.createRow(i + 1);
			T o = data.get(i);

			for (int j = 0; j < fields.length; j++) {
				Cell cell = row.createCell(index++ % fields.length);

				try {
					cell.setCellValue(BeanUtils.getProperty(o, fields[j]));
				} catch (Exception e) {
					throw new RuntimeException("export data error", e);
				}
			}
		}

		if (fileName == null || "".equals(fileName)) {
			fileName = System.currentTimeMillis() + ".xls";
		}

		try {
			wb.write(out);
		} catch (IOException e) {
			throw new RuntimeException("export data error", e);
		} finally {
			try {
				wb.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public <A> void exportToExcel(OutputStream out, String fileName, String sheetName, List<A> datas,
			Excelable<A> exporter) {
		Workbook wb = new HSSFWorkbook();
		if (StringUtils.isBlank(sheetName)) {
			sheetName = "ExportDataList";
		}
		createSheet(wb, sheetName, datas, exporter);
		if (StringUtils.isBlank(fileName)) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
			fileName = sdf.format(new Date()) + ".xls";
		}
		try {
			wb.write(out);
		} catch (IOException e) {
			throw new RuntimeException("export data error", e);
		}
	}

	public <A> Sheet createSheet(Workbook wb, String sheetName, List<A> datas, Excelable<A> exporter) {
		Sheet sheet;
		if (sheetName != null) {
			sheet = wb.createSheet(sheetName);
		} else {
			sheet = wb.createSheet();
		}
		if (datas != null && datas.isEmpty() == false) {
			List<ExcelCell[]> result = preprocessData(datas, exporter);
			int size = result.size();
			Map<ExcelCellStyle, CellStyle> styleMap = new HashMap<ExcelCellStyle, CellStyle>();
			for (int i = 0; i < size; i++) {
				createRow(wb, sheet, i, result.get(i), styleMap);
			}
		}
		return sheet;
	}

	public <A> List<ExcelCell[]> preprocessData(List<A> datas, Excelable<A> exporter) {
		List<ExcelCell[]> result = new ArrayList<ExcelCell[]>(datas.size() + 1);
		result.add(exporter.exportRowName());
		for (A data : datas) {
			result.add(exporter.exportRowValue(data));
		}
		return result;
	}

	@SuppressWarnings("deprecation")
	public Row createRow(Workbook wb, Sheet sheet, int rowNum, ExcelCell[] values,
			Map<ExcelCellStyle, CellStyle> styleMap) {
		Row row = sheet.createRow(rowNum);
		ExcelCell value = null;
		int size = values.length;
		Drawing<?> p = sheet.createDrawingPatriarch();
		for (int i = 0; i < size; i++) {
			Cell cell = row.createCell(i);
			value = values[i];
			if (value == null) {
				continue;
			}
			cell.setCellValue(value.getValue().toString());
			if (StringUtils.isBlank(value.getComment()) == false) {
				cell.setCellComment(createCellComment(p, value, (short) i, rowNum));
			}
			if (value.getCellType() != null) {
				cell.setCellType(value.getCellType());
			}
			ExcelCellStyle excelCellStyle = value.getCellStyle();
			if (excelCellStyle != null) {
				CellStyle cellStyle = styleMap.get(excelCellStyle);
				if (cellStyle == null) {
					cellStyle = wb.createCellStyle();
					styleMap.put(excelCellStyle, cellStyle);
					Font font = null;
					if (excelCellStyle.getAlignment() != null) {
						cellStyle.setAlignment(excelCellStyle.getAlignment());
					}
					if (excelCellStyle.getVerticalAlignment() != null) {
						cellStyle.setVerticalAlignment(excelCellStyle.getVerticalAlignment());
					}
					if (excelCellStyle.getFontColor() != null) {
						if (font == null) {
							font = wb.createFont();
						}
						font.setColor(excelCellStyle.getFontColor());
					}
					if (excelCellStyle.getBoldWeight() != null) {
						if (font == null) {
							font = wb.createFont();
						}
						font.setBoldweight(excelCellStyle.getBoldWeight());
					}
					if (font != null) {
						cellStyle.setFont(font);
					}
				}
				cell.setCellStyle(cellStyle);
			}
		}
		return row;
	}

	@SuppressWarnings("rawtypes")
	public Comment createCellComment(Drawing draw, ExcelCell value, short col, int row) {
		short col2 = col;
		int row2 = row;
		col2++;
		row2++;
		int len = 0;
		try {
			len = value.getComment().getBytes("GBK").length;
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (len > 24) {
			col2 = (short) (col + 3);
			row2 = row + (len - 1) / 24 + 1;
		} else {
			col2 = (short) (col + (len + 2) / 9 + 1);
		}
		Comment comment = draw.createCellComment(new HSSFClientAnchor(0, 0, 0, 127, col, row, col2, row2));
		comment.setString(new HSSFRichTextString(value.getComment()));
		comment.setVisible(value.isCommentVisible());
		return comment;
	}

	public static void main(String[] args) {

	}

}
