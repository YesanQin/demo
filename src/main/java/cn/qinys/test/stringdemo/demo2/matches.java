package cn.qinys.test.stringdemo.demo2;
/**
 * boolean matches(String regex)
 * 验证当前字符串是否满足给定的正则表达式的格式要求
 * 需要注意：无论正则表达式是否使用了“^”，“$”都是全
 * 匹配验证
 * @author soft01
 *
 */

public class matches {
	public static void main(String[] args){
		String str="fancq@tarena.com.cn";
		/*
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-z]+)+
		 */
		String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-z]+)+";
		boolean matches=str.matches(regex);
		//matches方法的参数为String形式，它是以字符串形式接收，但是按照正则表达式的格式读取的！
		if(matches){
			System.out.println("是邮箱");
		}else{
			System.out.println("不是邮箱");
		}
	}

}
