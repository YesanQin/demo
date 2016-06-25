package cn.qinys.test.designpattern.singletonpattern;
/**
 * 懒汉式单例模式
 * @author asus
 *
 */
public class Person2 {
	private static Person2 _instance = null;

	// 构造函数私有化，保证外检无法直接实例化
	private Person2() {

	}
	// 方法同步，防止多线程创建了多个实例
	synchronized public static Person2 getInstance() {
		if (_instance == null) {
			_instance = new Person2();
		}
		return _instance;
	}

}
