package com.extensions.logmonitor.util;

public interface Excelable<T> {
    ExcelCell[] exportRowName();

    ExcelCell[] exportRowValue(T row);
}
