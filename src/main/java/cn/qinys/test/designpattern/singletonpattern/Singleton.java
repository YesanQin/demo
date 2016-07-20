package cn.qinys.test.designpattern.singletonpattern;
/**
 * @qinys zxqinlang@126.com
 * @history 2016年7月19日 上午12:36:03
 */
public class Singleton {
	private Singleton(){
	}
	
	private static class SingletonFactory{
		private static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readResolve(){
		return getInstance();
	}
}
