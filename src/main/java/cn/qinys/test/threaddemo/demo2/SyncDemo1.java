package cn.qinys.test.threaddemo.demo2;
/**
 * 多线程并发安全问题：
 * 当多个线程同时操作一段数据时，由于线程切换的不确定性，可能导致出现逻辑混乱，严重的时候可能导致系统崩溃。
 * 为了解决多线程安全问题，我们需要将异步变为同步。
 * 意思就是：各干各的，变为有先后顺序排队干。
 * @author soft01
 *
 */
public class SyncDemo1 {
	public static void main(String[] args){
		final Table table=new Table();
		Thread t1=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
					while(true){
						int bean=table.getBean();
						Thread.yield();
						System.out.println(t.getName()+":"+bean);
					}
			}
		};
		Thread t2=new Thread(){
			public void run(){
				Thread t=Thread.currentThread();
				while(true){
					int bean=table.getBean();
					Thread.yield();
					System.out.println(t.getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}
}
class Table{
	private int beans=20;
	/*
	 * synchronized关键字
	 * 有两种方式:
	 * 1、修饰方法，当该关键字修饰方法后，该方法变为同步方法，即：多个线程不能同时调用当前方法
	 * 2、synchronized块。
	 * 
	 */
	public synchronized int getBean(){
		if(beans==0){
			throw new RuntimeException("没有豆子了");
		}
		Thread.yield();
		return beans--;
	}
	
}