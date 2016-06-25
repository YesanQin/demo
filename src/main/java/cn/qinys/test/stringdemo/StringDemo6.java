package cn.qinys.test.stringdemo;
/**
 * String trim()
 * 去除当前字符串中两边的空白
 * @author soft01
 *
 */
public class StringDemo6 {
	public static void main(String[] args){
		String str="   hello world!			";
		System.out.println(str);
		String trim=str.trim();
		System.out.println(trim);
	}

}
