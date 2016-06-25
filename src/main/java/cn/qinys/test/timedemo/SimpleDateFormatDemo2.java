package cn.qinys.test.timedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
	public static void main(String[] args) throws ParseException{
		String str="2008-08-08 20:08:00";
		SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		/*
		 * Data parse(String str)
		 * 将给定的字符串解析为Date对象并返回
		 */
		Date date=adf.parse(str);
		System.out.println(date);
	}

}
