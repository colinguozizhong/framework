package com.ustcsoft.jt.util;

import java.lang.reflect.Field;
import java.util.List;

public class CommonUtil {
	@SuppressWarnings("rawtypes")
	public static void trimValue(Object o) throws Exception {
		if(o == null){
			return;
		}
		Class classz = o.getClass();
		Field[] fields = classz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.getType() == String.class) {
				String temp = (String) field.get(o);
				if (temp != null) {
					field.set(o, temp.trim());
				}
			}
			if (field.getType() == List.class) {
				List list = (List) field.get(o);
				if (list != null) {
					for (Object obj : list) {
						trimValue(obj);
					}
				}
			}
		}
	}
}
