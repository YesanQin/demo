package cn.qinys.test;
class A {
	public A() {
		this.print();
	}
	public void print() {
	}
}

class B extends A {
	int x = 1000;
	public B(){
		System.out.println("x = " + x);
	}
	public B(int x) {
		this.x = x;
	}

	public void print() { // 覆写父类中的方法
		System.out.println("x = " + x);
	}
}
public class App {
	public static void main(String args[]) {
		B b = new B();
		b.print();
		System.out.println();
		new B(100);
	}
}
