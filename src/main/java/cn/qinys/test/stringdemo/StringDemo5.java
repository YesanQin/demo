package cn.qinys.test.stringdemo;
/**
 * 获取一个地址中的域名
 * @author soft01
 *
 */
public class StringDemo5 {
	public static void main(String[] args){
		String str="http://www.oracle.com.cn";
		/*
		 * 思路：
		 * 截取第一个“.”之后第一个字符开始到第二个“.”
		 * 之间的字符串。
		 */
		int start=str.indexOf(".")+1;
		int end=str.indexOf(".",start);
		String name=str.substring(start,end);
		System.out.println(name);
	}
}
