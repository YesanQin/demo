package cn.qinys.test;

/**
 * Hello world!
 *
 */
class A {
	public A() {
		this.print();
	}

	public void print() {
	}
}

class B extends A {
	int x = 10;

	public B(int x) {
		this.x = x;
	}

	public void print() { // 覆写父类中的方法
		System.out.println("x = " + x);
	}
}

public class App {
	public static void main(String args[]) {
		new B(100);
	}
}
