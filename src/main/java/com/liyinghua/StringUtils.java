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
	//本地修改
		public static boolean isBlank(String str) {
			return (str==null||str.trim().equals("")) ;
}
	public static boolean isMobile(String str) {
		
		return false;
		
	}
}
