package com.liyinghua;

import java.util.Calendar;
import java.util.Date;

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
		/**
		 * 
		 * @Title: getDateByInitMonth 
		 * @Description: 返回传入日期的月初
		 * @param src
		 * @return
		 * @return: Date
		 */
		public static Date getDateByInitMonth(Date src) {
			 //获取日历类
			Calendar c = Calendar.getInstance();
			//根据传入的日期构建日历类
			c.setTime(src);
			//设置月初
			c.set(Calendar.DAY_OF_MONTH, 1);//日
			c.set(Calendar.HOUR_OF_DAY, 0);//小时
			c.set(Calendar.MINUTE, 0);//分钟
			c.set(Calendar.SECOND, 0);//秒	
			return c.getTime();
		}
		/**
		 * 
		 * @Title: getDateByFullMonth 
		 * @Description: 获取传入日期的最后一秒
		 * @param src
		 * @return
		 * @return: Date
		 */
		public static Date  getDateByFullMonth(Date src) {
			Calendar c = Calendar.getInstance();
			c.setTime(src);
			//让月份加一
			c.add(Calendar.MONTH, 1);
			//让日期变成月初
			Date date = getDateByInitMonth(c.getTime());
			//让月初初始化日历类
			c.setTime(date);
			//减一
			c.add(Calendar.SECOND, -1);
			
			return c.getTime();
		}
}
