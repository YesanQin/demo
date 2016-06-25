package cn.qinys.test.stringdemo;
/**
 * 获取字符串中的部分内容
 * String substring（int stat，int end）
 * 从指定下标start处对应的字符开始，截取到指定下标end
 * 处之间的字符串，需要注意的是，不包含end位置的字符
 * java API 中凡是使用2个数字表示一个范围，通常都是“含头不含尾”的。
 * @author soft01
 *
 */

public class StringDemo4 {
	public static void main(String[] args){
		//              01 234 567 890 12
		String str="www.baidu.com";
		//获取“baidu”
		String sub=str.substring(4, 9);
		System.out.println(sub);
		//获取“baidu.com”
		sub=str.substring(4);
		System.out.println(sub);
	}

}
