package com.lyh.text;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.liyinghua.StringUtils;


public class TestStringUtils {
	@Test
	public void testIsBlank() {
		//断言测试
		assertFalse(StringUtils.isBlank("aaa"));
		assertTrue(StringUtils.isBlank(" "));
	}
	@Test
	public void textGetDateByInitMonth() {
		//获取更改后时间
		Date date = StringUtils.getDateByInitMonth(new Date());
		//设置格式
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//输出
		System.out.println(df.format(date));
	}
	@Test
	public void textGetDateByFullMonth() {
		
		Date date = StringUtils.getDateByFullMonth(new Date());
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
}
