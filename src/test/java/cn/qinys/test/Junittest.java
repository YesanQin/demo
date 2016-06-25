package cn.qinys.test;

import org.junit.Test;

public class Junittest {
	@Test
	public void a() {
		System.out.println("adadsdf");
		String str = new String();// 此时str在栈里面是存在的，只是没有值
		String str1 = "我sadfjslasf";
		System.out.println(str1.codePointCount(3, 6));
		char[] chs = { 'a', 's', 'd' };
		int[] t = { 1, 2, 4 };
		System.out.println(chs);
		System.out.println(t);
		System.out.println("OK".equals(str1));
	}
}
