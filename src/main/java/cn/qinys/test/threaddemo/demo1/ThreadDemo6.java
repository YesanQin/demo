package cn.qinys.test.threaddemo.demo1;
/**
 * 线程优先级
 * 优先级有10个等级，1-10，其中1最低，10最高，默认5
 * 有三个常量可以对应最低，最高，默认优先级。
 * Thread.MIN_PRIORITY   ==>1
 * Thread.MAX_PRIORITY   ==>10
 * Thread.NORM_PRIORITY  ==>5
 * @author soft01
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args){
		Thread min=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("min");
				}
			}
		};
		Thread max=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("max");
				}
			}
		};
		Thread norm=new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("norm");
				}
			}
		};
		min.setPriority(Thread.MIN_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		
		min.start();
		norm.start();
		max.start();
		
		
	}
}
