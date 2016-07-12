package cn.qinys.test.stringdemo;

public class SplitDemo
{
	public static void main(String[] args)
	{
		String str = "";
		String[] strs = str.split(",");
		System.out.println(strs.length+","+strs[0]);
	}
}
