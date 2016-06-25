package cn.qinys.test.timedemo;

import java.util.Calendar;

/**
 * Calendar提供了一个add方法，用来计算时间
 * void add（int field,int value）
 * 对指定的时间分量加上给定的值，若value是负数，则是减去指定的值
 * @author soft01
 *
 */
public class CalendarDemo3 {
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 查看3年零2个月又25天后是哪天？
		 */
		calendar.add(calendar.YEAR, 3);
		calendar.add(calendar.MONTH, 2);
		calendar.add(calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
	}

}
