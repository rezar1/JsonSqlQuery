package com.extensions.logmonitor.util;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class ExcelCellStyle {

	public static final short COLOR_BLACK = IndexedColors.BLACK.index;
	public static final short COLOR_WHITE = IndexedColors.WHITE.index;
	public static final short COLOR_GREY = IndexedColors.GREY_80_PERCENT.index;
	public static final short COLOR_GREEN = IndexedColors.GREEN.index;
	public static final short COLOR_RED = IndexedColors.RED.index;
	public static final short COLOR_YELLOW = IndexedColors.YELLOW.index;

	@SuppressWarnings("deprecation")
	public static final short ALIGN_CENTER = CellStyle.ALIGN_CENTER;
	@SuppressWarnings("deprecation")
	public static final short VERTICAL_CENTER = CellStyle.VERTICAL_CENTER;
	@SuppressWarnings("deprecation")
	public static final short BOLDWEIGHT_BOLD = Font.BOLDWEIGHT_BOLD;

	public static final ExcelCellStyle HEAD_STYLE = new ExcelCellStyle();
	static {
		HEAD_STYLE.boldWeight = BOLDWEIGHT_BOLD;
		HEAD_STYLE.alignment = ALIGN_CENTER;
		HEAD_STYLE.verticalAlignment = VERTICAL_CENTER;
	};

	private Short fontColor;
	private Short alignment;
	private Short verticalAlignment;
	private Short boldWeight;

	public Short getFontColor() {
		return fontColor;
	}

	public void setFontColor(Short fontColor) {
		this.fontColor = fontColor;
	}

	public Short getAlignment() {
		return alignment;
	}

	public void setAlignment(Short alignment) {
		this.alignment = alignment;
	}

	public Short getVerticalAlignment() {
		return verticalAlignment;
	}

	public void setVerticalAlignment(Short verticalAlignment) {
		this.verticalAlignment = verticalAlignment;
	}

	public Short getBoldWeight() {
		return boldWeight;
	}

	public void setBoldWeight(Short boldWeight) {
		this.boldWeight = boldWeight;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}
