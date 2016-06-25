package cn.qinys.test.stringdemo;
/**
 * java.lang.String
 * 字符串，用于描述一个字符序列
 * String是不变对象，处于下面原因：
 * 1、经常使用String作为方法的参数，为了保证方法调用的正确，要求字符串内容不可以改变。
 * 2、出于内存考虑你，重用在实际开发中远比修改多，所以java在重用字符串时没有创建新
 * 对象，而是都引用同一个。这就要求该字符串内容不可变。
 * @author soft01
 *
 */
public class StringDemo {
	/**
	 * 
	 */
	public static void main(String[] args){
		String s1="123abc";
		String s2="123abc";//字符串属于引用类型对象，但其声明规则与统一的格式不同，此处体现出String类的特权
		//但其也因为这些特权而被限制不能被继承
		String s3=new String("123abc");//应用类型对象声明的一般类型
		s1+="!";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s1);
		System.out.println(s2);
		/**
		 * 编译器在编译源程序时若发现表达式计算两边的内容都是字面量，会先进行运算
		 * 再将结果生成到子解码文件中，所以JVM在运行class文件时，下面的内容样子为：
		 * String s4="123abc";
		 */
		String s4="123"+"abc";//编译器已经计算完了，在.class文件中已经是"132abc",所以仍是静态字符串
		System.out.println(s2==s4);
		String s="123";
		String s5=s+"abc";
		System.out.println(s2==s5);
	}

}
