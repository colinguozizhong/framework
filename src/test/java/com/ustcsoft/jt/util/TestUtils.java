package com.ustcsoft.jt.util;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class TestUtils {

	@Test
	public void test() {
		String menuId = "0101100000";
		String temp = menuId.replaceAll("(00)+$", "");
		int insertMenuId = Integer.parseInt("0101100000".substring(1,
				temp.length() + 2)) + 1;
		String menuIdStr = StringUtils.rightPad(
				temp.substring(0, 1) + String.valueOf(insertMenuId), 10, "0");

		System.out.println(menuIdStr);
	}
}
