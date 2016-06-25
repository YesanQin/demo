package cn.qinys.test.stringdemo;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是够是以给定的字符串开头的，
 * 另一个是判断是否是以给定的字符串结尾的。
 * @author soft01
 *
 */

public class StringDemo9 {
	public static void main(String[] args){
		String str="thinking in java";
		
		boolean starts=str.startsWith("think");
		System.out.println("start: "+starts);//true
		
		boolean ends=str.endsWith("ava");
		System.out.println("ends: "+ends);//true
		//判断文件格式是否符合要求的格式
	}

}
