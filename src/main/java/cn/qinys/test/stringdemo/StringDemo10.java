package cn.qinys.test.stringdemo;
/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全大写和全小写
 * @author soft01
 *
 */
public class StringDemo10 {
	public static void main(String[] args){
		String str="我爱Java";
		
		String upper=str.toUpperCase();
		System.out.println(upper);
		String lower=str.toLowerCase();
		System.out.println(lower);
		//输入的时候可以忽略大小写功能（例如验证码的判断）
	}

}
