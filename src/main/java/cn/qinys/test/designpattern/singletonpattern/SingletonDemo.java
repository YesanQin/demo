package cn.qinys.test.designpattern.singletonpattern;

import java.util.Random;

import sun.security.acl.PermissionImpl;

public class SingletonDemo {
	public static void main(String[] args) {
		CourierThread courier1 = new CourierThread("线程1");
		CourierThread courier2 = new CourierThread("线程2");
		courier1.start();
		courier2.start();
//		Person person = new Person();//因为该类的构造函数是private，所以不能通过这种方式实例化，唯一的方式就是调用其getInstance方法获得
	}
}

class CourierThread extends Thread {
	private String threadName;
	String[] couriers = { "顺丰快递", "中通快递", "圆通快递", "韵达快递", "天天快递" };
	Person person = Person.getInstance();
	Random random = new Random();

	public CourierThread(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(
					threadName + ":你好，我是【" + couriers[random.nextInt(couriers.length)] + "】，请问你是秦义胜吗？有你的快递，请来取快递！");
			System.out.println("回答：" + threadName + "\t" + person.getAnswer());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
