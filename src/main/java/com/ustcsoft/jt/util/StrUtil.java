
package com.ustcsoft.jt.util;

import java.io.UnsupportedEncodingException;


/**
 * @author bsli123@starit.com.cn
 * @date 2012-2-3 下午3:11:24
 */
public class StrUtil {
	/**
     */
    public static String rPad(String source, int length, String charset) {
        int padLength = 0;
        if (source == null){
            source = "";
        }
        try {
            padLength = length - source.getBytes(charset).length;
        } catch (UnsupportedEncodingException ex) {
            padLength = length - source.getBytes().length;
        }
        if (padLength <= 0) {
            return source;
        }
        while (SPACE.length() < padLength) {
            SPACE = SPACE.concat(SPACE);
        }
        return source.concat(SPACE.substring(0, padLength));
    }

    /**
     */
    public static String lPad(String source, int length) {
        int padLength = 0;
        if (source == null){
            source = "";
        }
        padLength = length - source.length();
        if (padLength <= 0) {
            return source;
        }else{
        	return "0".concat(source);
        }
       
    }
    
    private static String SPACE = "000000";
    /**
     */
    public static boolean isNullString(String str) {
        return (str == null || "".equals(str.trim()));
    }

    public static boolean isNullInteger(Integer iIn) {
        return (iIn == null);
    }
    /**
     * 替换一个字符串中的某些指定字符
     * @param strData String 原始字符串
     * @param regex String 要替换的字符串
     * @param replacement String 替代字符串
     * @return String 替换后的字符串
     */
    public static String replaceString(String strData, String regex,
            String replacement)
    {
        if (strData == null)
        {
            return null;
        }
        int index;
        index = strData.indexOf(regex);
        String strNew = "";
        if (index >= 0)
        {
        	StringBuilder buf = new StringBuilder();
            while (index >= 0)
            {
            	buf.append(strData.substring(0, index) + replacement);
                strData = strData.substring(index + regex.length());
                index = strData.indexOf(regex);
            }
            
            strNew += buf.toString()+strData;
            return strNew;
        }
        return strData;
    }
 
    /**
     * 替换字符串中特殊字符
     */
  public static String encodeString(String strData)
    {
        if (strData == null)
        {
            return "";
        }
        strData = replaceString(strData, "&", "&amp;");
        strData = replaceString(strData, "<", "&lt;");
        strData = replaceString(strData, ">", "&gt;");
        strData = replaceString(strData, "&apos;", "&apos;");
        strData = replaceString(strData, "\"", "&quot;");
        return strData;
    }
 
    /**
     * 还原字符串中特殊字符
     */
   public static String decodeString(String strData)
    {
        strData = replaceString(strData, "&lt;", "<");
        strData = replaceString(strData, "&gt;", ">");
        strData = replaceString(strData, "&apos;", "&apos;");
        strData = replaceString(strData, "&quot;", "\"");
        strData = replaceString(strData, "&amp;", "&");
        return strData;
    }
	private StrUtil() {
		
		
	}
}
