package cn.qinys.test.stringdemo.demo2;
/**
 * 包装类
 * 由于java中有8个基本类型，它们不是以对象的形式
 * 存在，没有面向对象的特性，所以不能参加面向对象的开发，
 * 为了解决这个问题，java针对它们定义了8个包装类。
 * 其中有6个表示数字的，它们都继承自Number类。
 * @author soft01
 *
 */

public class IntegerDemo {
	public static void main(String[] args){
		//将int转换为包装类Integer
		Integer i=new Integer(123);
		//从包装类转换为基本类型
		int ii=i.intValue();
		long iii=i.intValue();
//		long iii=i.longValue();
		double iiii=i.intValue();
//		double iiii=i.doubleValue();
		System.out.println(ii+" "+iii+" "+iiii);
		/*
		 * 基本类型转换为包装类型更常用的方式不是直接new对象，
		 * 而是使用包装类的静态方法valueOf
		 */

		Integer i1=Integer.valueOf(123);
		Integer i3=Integer.valueOf(123);//缓存一个字节的对象 -128-127之间时，i3和i2相等，超过127则不行
//		此情况仅适用于byte数据，其他都不行，在实际引用中推荐使用valueOf来创建包装类
		Integer i2=234;//此时编译器自动解释，做拆包和自动装包处理
		
		
	}
}

