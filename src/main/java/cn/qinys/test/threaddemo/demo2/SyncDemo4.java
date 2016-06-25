package cn.qinys.test.threaddemo.demo2;
/**
 * 静态方法上添加synchronized，那么锁的是用于描述当前类的一个class的实例。
 * class的每一个实例都可以描述java中的一个类。而且每个类在JVM中只有一个Class实例表示。
 * 所以静态方法跟对象无关，一定具有同步效力。
 * 
 * 静态方法之间有“同步效果”
 * 也有“互斥效果”
 * @author soft01
 *
 */
public class SyncDemo4 {
	public static void main(String[] args){
		final Boo b1=new Boo();
		final Boo b2=new Boo();
		Thread t1=new Thread(){
			public void run(){
				b1.dosome();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				b2.dosome();
			}
		};
		t1.start();
		t2.start();
		
	}
}
class Boo{
	public synchronized static void dosome(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在调用dosome()方法。。。");
			Thread.sleep(5000);
			System.out.println(t.getName()+"调用方法完毕");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}