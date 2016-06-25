package cn.qinys.test.threaddemo.demo1;
/**
 * 线程的第二种创建方式：
 * 1、单独定义线程要执行的任务
 *    定义一个类，实现Runnable接口，并重写run方法
 * 2、创建线程并将任务指派进去再启动
 * 
 * 优点：
 * 1、单独定义任务，在用的时候才指派给线程，所以与线程没有必然的耦合段系，利于线程重用。
 * 2、由于任务类是实现Runnable接口，java接口是多实现的，所以无论是继承其他类还是实现
 * 其他接口都不再受影响。
 * @author soft01
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args){
		//创建任务
		Runnable runn1=new MyRunnable1();
		Runnable runn2=new MyRunnable2();
		
		//创建线程，并将任务指派给线程。
		Thread t1=new Thread(runn1);
		Thread t2=new Thread(runn2);
		
		t1.start();
		t2.start();
		
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("你是谁啊？");
		}
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是查水表的。");
		}
	}
}