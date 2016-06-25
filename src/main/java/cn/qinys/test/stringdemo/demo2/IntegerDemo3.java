package cn.qinys.test.stringdemo.demo2;
/**
 * 包装类提供了一个非常常用的静态方法
 * parseXXX（String str）
 * 可以将给定的字符串转换为包装类对应的基本类型值
 * @author soft01
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args){
		String str="123.123";
//		int i=Integer.parseInt(str);//出现异常，转换之后不能完全表示被转换的数，所以出现异常
//		System.out.println(i)；
		             
		Double i1=Double.parseDouble(str);
		System.out.println(i1);
		
	}

}
