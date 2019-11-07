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
	//云端修改
		public static boolean isBlank(String str) {
			return (str==null||str.trim().equals("")) ;
}
}
