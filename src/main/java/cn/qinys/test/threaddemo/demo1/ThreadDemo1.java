package cn.qinys.test.threaddemo.demo1;
/**
 * 线程
 * 并发运行，可以“同时”完成多个任务。
 * 线程有两种创建模式
 * 模式1：
 * 定义一个类并继承Thread，然后重写run方法，在内部编写该程序要执行的任务。
 * 模式2：
 * 
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){
		Thread t1=new MyThread();
		Thread t2=new MyThread2();
		/*
		 * 注意！启动线程不要直接调用run方法。而是调用start方法。该方法会将当前线程注册到
		 * 线程调度中，使其可以并发运行。
		 * start方法调用完毕后意味着当前线程进入了runnable状态，一旦线程调度分配时间片就开始运行。
		 * 
		 * 线程对于线程调度的工作不可控：
		 * CPU时间片分配给哪个线程不可控。
		 * 时间片长短不可控。
		 * 
		 * 不过线程调度会尽可能的均匀的将时间片分配给每个线程。
		 */
		t1.start();
		/*
		 * 此时t1和t2是异步进行的，非同步，t1和t2的运行是相对独立的！
		 */
		t2.start();
	}
}

/*
 * 第一种创建线程的方式存在两个弊端：
 * 1、由于java是单继承的，所以若我们继承了Thread就无法再继承其他类，这对于项目开发而言是不可容忍的。
 * 2、重写run方法会导致线程与线程要执行的任务有一个耦合关系，这导致当前线程只会完成该任务，不利于
 * 线程的重用。
 * 
 * 第一种创建线程的方式也存在一个优点：
 * 定义简便，当我们需要临时使用一个线程完成某个任务时通常会使用匿名内部类，这时候用第一种方式创建比较理想。
 */
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("你是谁啊？");
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("我是查水表的。");
		}
	}
}


