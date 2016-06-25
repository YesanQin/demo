package cn.qinys.test.threaddemo.demo2;
/**
 * 方法上用synchronized修饰有一个弊端，
 * 就是该方法所有代码都需要同步，除非真的需要这样，否则这个方法的执行变得比较地下。
 * synchronized块允许我们扩上需要同步的代码片段，这样在保证线程并发执行安全的前提
 * 下缩小了同步范围提高了代码的执行效率。
 * 
 * 当多个线程看到synchronized修饰的同一方法或一个代码片段时，那么这是同步效果，意思
 * 是多个线程不能同时访问该方法或该段代码。
 * 那么这个时候synchronized被称为“同步锁”。
 * @author soft01
 *
 */
public class SyncDemo2 {
	public static void main(String[] args){
		final Shop shop=new Shop();
		Thread t1=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		Thread t2=new Thread(){
			public void run(){
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}

class Shop{
//	public synchronized void buy(){
	public void buy(){
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+":"+"正在选衣服...");
			Thread.sleep(5000);
			/*
			 * synchronized无论是直接修饰方法，还是像下面一样使用块的形式，都需要有一个
			 * “锁对象”，这个对象可以是任意对象，但是要想保证多个线程具有同步效力，那么必须保证这些
			 * 线程看到的对象是同一个即可！
			 * 直接修饰方法时，锁对象就是该方法所属的对象，所以使用块的形式也可以是用该对象，
			 * 那么这个对象就是“this”。
			 */
			//多线程共享部分放入synchronized块里面！
			synchronized(this){
				System.out.println(t.getName()+":"+"正在试衣服...");
				Thread.sleep(5000);
			}
			
			System.out.println(t.getName()+":"+"结帐离开！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}