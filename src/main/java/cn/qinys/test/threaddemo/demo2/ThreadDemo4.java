package cn.qinys.test.threaddemo.demo2;
/**
 * Object中定义了两个方法wait、notify
 * 当一个线程调用了一个对象的wait方法后，该线程进入阻塞状态，直到这个对象的notify方法被调用
 * 才可以解除阻塞。对于协调线程同步而言，这种方式比join的即时性强，因为join必须被动的等待其他
 * 线程完成所有工作。
 * @author soft01
 *
 */
public class ThreadDemo4 {
	private static boolean isFinish;
	public static Object obj=new Object();
	public static void main(String[] args){

		/*
		 * 下载线程
		 */
		final Thread down=new Thread(){
			public void run(){
				System.out.println("开始下载图片。。。");
				for(int i=0;i<101;i++){
					System.out.println("图片下载进度："+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("图片下载完毕！");
				isFinish=true;
				/*
				 * 当图片下载完毕，就可以通知显示线程显示图片了
				 */
				synchronized(obj){
					obj.notify();
				}
				
				/*
				 * 下载附件
				 */
				System.out.println("开始下载附件。。。");
				for(int i=0;i<101;i++){
					System.out.println("附件下载进度："+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("附件下载完毕！");
			}
		};
		/*
		 * 显示线程
		 */
		Thread show=new Thread(){
			public void run(){
				System.out.println("show线程开始进入。。。");
				try {
					synchronized(obj){
						obj.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(!isFinish){
					throw new RuntimeException("图片显示失败！");
				}
				System.out.println("开始显示图片。。。");
				for(int i=0;i<101;i++){
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("图片显示进度："+i+"%");
				}
				System.out.println("图片显示完毕！");
			}
		};
		down.start();
		show.start();
		
	}
}
