package com.extensions.logmonitor.util;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ExcelCell {
	 private Integer cellType;
	    private Object value;
	    private String comment;
	    private boolean isCommentVisible = false;
	    private ExcelCellStyle cellStyle;

	    public ExcelCell() {
	        super();
	    }
	    
	    public ExcelCell(Object value) {
	        super();
	        this.setValue(value);
	    }

	    public ExcelCell(Object value, ExcelCellStyle cellStyle) {
	        super();
	        this.setValue(value);
	        this.setCellStyle(cellStyle);
	    }

	    public Integer getCellType() {
	        return cellType;
	    }

	    public void setCellType(Integer cellType) {
	        this.cellType = cellType;
	    }

	    public Object getValue() {
	        if(value == null){
	            value = "";
	        }
	        return value;
	    }

	    public void setValue(Object value) {
	        if(value == null){
	            value = "";
	        }
	        this.value = value;
	    }

	    public String getComment() {
	        return comment;
	    }

	    public void setComment(String comment) {
	        this.comment = comment;
	    }

	    public boolean isCommentVisible() {
	        return isCommentVisible;
	    }

	    public void setCommentVisible(boolean isCommentVisible) {
	        this.isCommentVisible = isCommentVisible;
	    }

	    public ExcelCellStyle getCellStyle() {
	        return cellStyle;
	    }

	    public void setCellStyle(ExcelCellStyle cellStyle) {
	        this.cellStyle = cellStyle;
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
