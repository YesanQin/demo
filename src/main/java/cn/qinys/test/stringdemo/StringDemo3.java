package cn.qinys.test.stringdemo;
/**
 * int indexOf(String str)
 * 查找给定的字符串在当前字符串中第一次出现的位置。
 * 返回值为给定的字符串第一个字符在当前字符串的下标。
 * 由于java大小写敏感，所以必须全部匹配上才可以返回具体下标。
 * 若没有找到，会返回-1。
 * 
 * @author soft01
 *
 */

public class StringDemo3 {
	public static void main(String[] args){
//                      01 234 567 89 0123 45
		String str="thinking in java";
		//java编程思想
		int index=str.indexOf("in");
		System.out.println(index);//返回2
		/*
		 * 重载方法
		 * int indexOf(String str,int from)
		 * 从当前字符串指定下标位置开始查找第一次出现给定字符串的位置。
		 * 同样的，若没有找到会返回-1。
		 */
		
		index=str.indexOf("in", 3);
		System.out.println(index);//5
		/*
		 * int lastIndexOf(String str)
		 * 查找当前字符串中最后一次出现给定字符串的位置
		 */
		index=str.lastIndexOf("in");
		System.out.println(index);//9
		/*
		 * 实际应用中，常被用作检查一个字符串中是否出现
		 * 了要求的关键字，甚至确定位置使用。
		 */
		
		
	}

}
