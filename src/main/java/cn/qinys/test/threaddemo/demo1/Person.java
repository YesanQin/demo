package cn.qinys.test.threaddemo.demo1;
/**
 * 用来测试throw与throws的用法
 * 通常两种情况会使用throw抛出一个异常：
 * 1、程序中遇到了一个满足语法要求，但是不满足业务逻辑要求的情况时，可以自行创建一个异常的实例并抛出给
 * 调用者。
 * 2、程序执行过程中确实出现了一个异常，但是不应当在当前方法中解决时，可以将其抛出给调用者。
 * @author soft01
 *
 */
public class Person {
	private int age;
	/*
	 * 当给定的实参值不满足这里的取值要求时（不满足描述人类信息的业务逻辑）可以抛出一个异常通知调用者。
	 */
	public void setAge(int age) throws IllegalAgeException{
		if(age<=0||age>100){
			throw new IllegalAgeException("不符合人类年龄");
		}
		this.age=age;
	}
	public int getAge(){
		return age;
	}

}
