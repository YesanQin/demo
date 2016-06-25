package cn.qinys.test.timedemo;

import java.sql.Date;
import java.util.Calendar;

/**
 * Calendar提供了一个set方法，允许我们
 * 对当前Calendar的各个时间分量进行单独
 * 设定。
 * @author soft01
 *
 */
public class CalendarDemo2 {
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		/*
		 * 设置各个时间分量
		 * 使其表示：2008/08/08 20：08：08
		 * 需要注意，设置了某个时间分量的值可能会
		 * 影响其他时间分量的值
		 * 例如：设置了年，月，日可能会将星期几改变。
		 */
		//设置年份
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		calendar.set(calendar.MONTH,7);//月份是从0开始，所以这里7表示8月
		System.out.println(calendar.getTime());
		calendar.set(calendar.DAY_OF_MONTH,8);
		System.out.println(calendar.getTime());
		calendar.set(calendar.HOUR_OF_DAY,8);
		calendar.set(calendar.MINUTE,8);
		calendar.set(calendar.SECOND,8);
		
		System.out.println(calendar.getTime());
		
	}

}
