package cn.qinys.test.timedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 该类的作用是使用给定的字符串格式在
 * Date与String之间进行相互转换。
 * 对于该类，需要掌握：
 * 1、会写日期
 * @author soft01
 *
 */

public class SimpleDateFoematDemo1 {
	public static void main(String[] args){
		Date now=new Date();
		System.out.println(now);
		/*
		 * 2015-08-24 11:09:55
		 */
		SimpleDateFormat adf=new SimpleDateFormat("yyyy年MM月dd日 HH：mm：ss a E");
		String str=adf.format(now);
//		System.out.println(adf);
		System.out.println(str);
	}

}
