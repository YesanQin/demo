package cn.qinys.test.timedemo;

import java.util.Date;

/**
 * java.util.Date
 * 其每一个实例用于表示一个时间点
 * 内部维护一个long值，该值是从UTC时间
 * 1970/01/01 00：00：00至当前Date表示的时间点之间的毫秒差
 * @author soft01
 *
 */

public class DateDemo1 {
	public static void main(String[] args){
		/*
		 * 默认创建出来的Date实例表示当前系统时间
		 */
		Date date=new Date();
		/*
		 * Date重写了toString，只是对于非英语地区国家来说不是很友好
		 */
		System.out.println(date);//可以看出此时默认调用了Date类中的totring方法输出时间的
		/*
		 * 获取Date内部维护的long值
		 */
		long l=date.getTime();
		System.out.println(l);
		//表示明天当前时间
		l+=1000*60*60*24;
		/*
		 * 支持传入long值的构造方法
		 * 创建的Date就表示该long值所表示的时间
		 */
		Date now=new Date(l);
		/*
		 * 也可以在现有的Date对象上调用setTime方法将long值传入，使其表示这个时间
		 */
		date.setTime(l);
		System.out.println(date);
		System.out.println(now);
	}
}


