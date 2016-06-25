package cn.qinys.test.threaddemo.demo2;
/**
 * synchronized也可以达到让不同代码间存在互斥效果。
 * 即：当一个线程执行一段代码时，另一个线程除了当前代码不能执行外，另一段代码也不能执行。
 * 互斥的关键：锁对象一致。
 * @author soft01
 *
 */
public class SyncDemo3 {
	public static void main(String[] args){
		final Foo foo=new Foo();
		Thread t1=new Thread(){
			public void run(){
				foo.methodA();
			}
	    };
	   Thread t2=new Thread(){
		public void run(){
			foo.methodB();
		}
	    };
	    Thread t3 = new Thread(){
	    	public void run(){
	    		foo.methodA();
	    	}
	    };
	    t1.start();
	    t2.start();
	    t3.start();
	}
}
class Foo{
	public synchronized void methodA(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+"正在调用A方法。。。");
			Thread.sleep(5000);
			System.out.println(t.getName()+"调用A方法完毕！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
   public synchronized void methodB(){
		   try {
				Thread t=Thread.currentThread();
				System.out.println(t.getName()+"正在调用B方法。。。");
				Thread.sleep(5000);
				System.out.println(t.getName()+"调用B方法完毕！");
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
