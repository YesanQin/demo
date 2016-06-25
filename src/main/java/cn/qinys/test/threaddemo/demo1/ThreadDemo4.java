package cn.qinys.test.threaddemo.demo1;
/**
 * Thread提供了一个静态方法currentThread，该方法可以获取运行这个方法的线程。
 * 
 * 实际上main方法也是靠一个线程运行的，只是该线程不是由我们直接创建的。
 * @author soft01
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args){
		//获取运行main方法的线程
		Thread t=Thread.currentThread();
		System.out.println(t);
		/*
		 * Thread-0
		 */
		dosome();
		Thread my=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				System.out.println(t);
				dosome();
			}
		};
		my.start();
		}
	public static void dosome(){
		Thread t=Thread.currentThread();
		System.out.println("运行dosome的线程是："+t);
	}
}
