package cn.qinys.test.timedemo;

import java.util.Calendar;

public class SimpleDateFormatDemo3 {
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		//获取年
		int year=calendar.get(calendar.YEAR);
		int month=calendar.get(calendar.MONTH);
		int week=calendar.get(calendar.DAY_OF_WEEK);
		System.out.println("星期："+(week==1?7:week-1));
		
	}

}
