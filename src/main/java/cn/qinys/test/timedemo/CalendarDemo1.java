package cn.qinys.test.timedemo;

import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calendar
 * 日历类，用于操作时间
 * 常用的是隔离高利历法（阳历）
 * 默认创建出来的Calender实现类的实例表示
 * 当前系统时间
 * @author soft01
 *
 */

public class CalendarDemo1 {
	public static void main(String[] args){
		/*
		 * Calendar 的 getInstance可以根据当前系统所
		 * 在地区创建合适的实现类，通常是隔离高利历法
		 */
		Calendar calendar =Calendar.getInstance();
		/*
		 * 不能直观看到具体表示的时间。
		 */
		System.out.println(calendar);
		/*
		 * calendar->Date
		 * Date getTime()
		 * Calendar 提供的getTime方法可以将其表示的时间移Date形式返回。
		 */
		Date date=calendar.getTime();
		System.out.println(date);
		/*
		 * Date->Calendar
		 * void setTime(Date date)
		 * Calendar提供了一个setTime（）方法，可以使当前Calendar表示给定的date所表示的时间。
		 */
		calendar.setTime(date);
		
		
		
		
	}

}
