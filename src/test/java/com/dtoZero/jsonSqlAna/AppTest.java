package com.dtoZero.jsonSqlAna;

import java.security.MessageDigest;

/**
 * Unit test for simple App.
 */
public class AppTest {

	public static void main(String[] args) {
		String md5Str = string2MD5("Rezar");
		System.out.println(md5Str);
		System.out.println(numericToString(1234567, 32));
		System.out.println(stringToNumeric("15ML7", 32));

	}

	final static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z' };

	/**
	 * 将十进制的数字转换为指定进制的字符串。
	 * 
	 * @param i
	 *            十进制的数字。
	 * @param system
	 *            指定的进制，常见的2/8/16。
	 * @return 转换后的字符串。
	 */

	public static String numericToString(int i, int system) {
		long num = 0;
		if (i < 0) {
			num = ((long) 2 * 0x7fffffff) + i + 2;
		} else {
			num = i;
		}
		char[] buf = new char[32];
		int charPos = 32;
		while ((num / system) > 0) {
			buf[--charPos] = digits[(int) (num % system)];
			num /= system;
		}
		buf[--charPos] = digits[(int) (num % system)];
		return new String(buf, charPos, (32 - charPos));
	}

	/**
	 * * 将其它进制的数字（字符串形式）转换为十进制的数字。 * * @param s * 其它进制的数字（字符串形式） * @param system
	 * * 指定的进制，常见的2/8/16。 * @return 转换后的数字。
	 */

	public static int stringToNumeric(String s, int system) {
		char[] buf = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		long num = 0;
		for (int i = 0; i < buf.length; i++) {
			for (int j = 0; j < digits.length; j++) {
				if (digits[j] == buf[i]) {
					num += j * Math.pow(system, buf.length - i - 1);
					break;
				}
			}
		}
		return (int) num;
	}

	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];
		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString().toUpperCase();
	}

}
