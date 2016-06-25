package cn.qinys.test.stringdemo;
/**
 * static String valueOf()
 * 字符串提供了若干的静态方法valueOf()
 * 作用就是将其他类型转换为字符串。比较常见的是将基本类型转换为字符串。
 * @author soft01
 *
 */

public class StringDemo11 {
	public static void main(String[] args){
		int a=123;
		String s1=String.valueOf(a);
		System.out.println(s1+4);//"1234"
		
		
		double d=123.123;
		String s2=String.valueOf(d);
		System.out.println(s2+4);//"123.1234"
		
		//任何类型与字符串连接结果都是字符串。
		String s3=123+"";//效率较低
		System.out.println(s3);
		
	}

}
