package com.liyinghua;

public class StringUtils {
	/**
	 * 
	 * @Title: isBlank 
	 * @Description: 判断字符串是否为空
	 * @param str
	 * @return
	 * @return: boolean
	 */
		public static boolean isBlank(String str) {
			return (str==null||str.trim().equals("")) ;
}
}
