package cn.qinys.test.stringdemo;
/**
 * java.lang.StringBuilder
 * 内部维护一个可变的字符数组，为了解决频繁修改
 * 字符串内容带来的性能损耗
 * 内部提供了用于编辑字符串的相关方法：
 * 曾删改插
 * @author soft01
 *
 */

public class StringBuilderDemo {
	public static void main(String[] args){
		String str="努力学习java，为了找个好工作！";
		StringBuilder sb=new StringBuilder(str);
		/*
		 * 努力学习java，为了找个好工作！然后改变世界!
		 * StringBuilder append(String str)
		 * 在当前字符串末尾追加给定内容
		 */
		
		sb.append("然后改变世界！");
//		System.out.println(sb);
		str=sb.toString();
		System.out.println(str);
		/*
		 * 努力学习java，为了改变世界!
		 * StringBuilder delete(int start,int end)
		 * 删除当前字符串中给定范围内的字符串
		 */
		sb.delete(11,19);
		str=sb.toString();
		System.out.println(str);
		/*
		 * 努力学习java，就是为了改变世界!
		 * StringBuilder insert(int offset,String str)
		 * 将给定的字符串内容插入到指定位置处
		 */
		sb.insert(9, "就是");
		str=sb.toString();
		System.out.println(str);
		/*
		 * 活着，就是为了改变世界!
		 * StringBuilder replace(int start,int end,String str)
		 * 将当前字符串中给定范围的字符串替换为给定的字符串
		 */
		sb.replace(0,8,"活着");
		str=sb.toString();
		System.out.println(str);
		
//		sb.append("然后改变世界！").delete(11,19).insert(9, "就是").replace(0,8,"活着");
		
		//字符串反转，可以用来判断回文
		sb.reverse();
		str=sb.toString();
		System.out.println(str);
	}
}
