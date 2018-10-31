package com.dtoZero.jsonSqlAna;

/**
 * 
 * @say little Boy, don't be sad.
 * @name Rezar
 * @time 2018年10月31日 下午8:25:29
 * @Desc 些年若许,不负芳华.
 *
 */
public class TestHelper {

	/**
	 * @param value
	 * @param value2
	 */
	public boolean singleValueMatch(Object matchValue, Object value) {
		if (value instanceof String) {
			return compareAsString(matchValue.toString(), value.toString());
		}
		return false;
	}

	static String optType = "eq";

	/**
	 * @param value
	 * @param string
	 * @return
	 */
	private boolean compareAsString(String valueArgu, String valueTryToMatch) {
		switch (optType) {
		case "eq":
			return valueTryToMatch.compareTo(valueArgu) == 0;
		}
		return true;
	}

}
