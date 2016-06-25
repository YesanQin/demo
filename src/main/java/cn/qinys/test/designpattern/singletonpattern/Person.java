package cn.qinys.test.designpattern.singletonpattern;

/**
 * 饿汉式单例模式
 * @author asus
 *
 */
public class Person {
	private static Person person = new Person();
	//取快递的次数
	private int num = 0;

	//构造函数私有化，保证外面不能直接创建对象
	private Person() {

	}

	public static Person getInstance() {
		return person;
	}
	
	public synchronized String getAnswer(){
		return "我是秦义胜，请稍等马上来！这是第"+(++num)+"个快递！";
	}
}
