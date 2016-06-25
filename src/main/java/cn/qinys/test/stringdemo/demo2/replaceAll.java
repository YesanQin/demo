package cn.qinys.test.stringdemo.demo2;
/**
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式部分的内容替换为
 * 给定的字符串
 * @author soft01
 *
 */

public class replaceAll {
	public static void main(String[] args){
		String str="fad41fgdf45asfa23s1fsf4465fsa1v32z23ds4fgs5fds645f";
		/*
		 *将当前字符串中的数字部分，替换为“#NUMBER#”
		 */
//		str=str.replaceAll("[0-9]+", "#NUMBER#");
		str=str.replaceAll("\\d+", "#NUMBER#");
		System.out.println(str);
	}

}
