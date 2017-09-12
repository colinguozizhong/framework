package com.ustcsoft.jt.util;

import org.apache.commons.lang.StringUtils;

public class CommonUtils {

	public static String getParentId(String id) {
		String temp = id.replaceAll("(00)+$", "");
		return StringUtils.rightPad(temp.substring(0, temp.length() - 2),
				id.length(), "0");
	}

	public static String getSearchId(String id) {
		if (id == null) {
			return id;
		}
		String temp = id.replaceAll("(00)+$", "");
		return temp;
	}

	public static String getChildId(String id, int i) {
		String temp = id.replaceAll("(00)+$", "");
		String temp2 = StringUtils.rightPad(temp.substring(0, temp.length()),
				temp.length() + 2, "0");
		long child = Long.parseLong(temp2) + i;
		String childId = StringUtils.rightPad(String.valueOf(child),
				id.length(), "0");
		return childId;
	}

	public static void main(String[] args) {
		System.out.println(getSearchId("3402000000000000"));
	}
}
