package cn.qinys.test.threaddemo.demo2;
/**
 * join方法
 * jion方法会阻塞运行该方法的线程，允许该线程在另一个线程上等待，直到那个线程的工作结束，当前
 * 线程才会解除阻塞继续运行。
 * 该方法通常为了实现两个线程间同步（有先后顺序工作）的情况。
 * @author soft01
 *
 */

public class ThreadDemo3 {
	//标示图片是否下载完毕
	public static boolean isFinish;
	public static void main(String[] args){
		/*
		 * 下载线程
		 */
	final Thread down=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("down:开始下载图片..");
					System.out.println("down:下载进度："+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("down：图片下载完毕！");
				isFinish=true;
			}
		};
		/*
		 * 显示线程
		 */
		Thread show=new Thread(){// 局部匿名内部类
			public void run(){
				System.out.println("show：开始显示图片。。。。");
				/*
				 * 显示之前应当等待下载线程把图片下载完毕！
				 */
				/*
				 * 一个方法中的局部内部类中若想引用这个方法的其他局部变量，那么这个变量必须是final的
				 */
				try {
					down.join();//等待当前线程结束，即等down线程结束之后再执行下面的任务。
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("show：图片显示失败！");
				}
				System.out.println("show：图片显示完毕！");
			}
		};
		down.start();
		show.start();
		
	}
}
