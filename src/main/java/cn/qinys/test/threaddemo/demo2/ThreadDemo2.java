package cn.qinys.test.threaddemo.demo2;
/**
 * 守护线程，又称为后台线程。
 * 当一个进程中的所有前台线程都结束时，进程就要结束，无论后台线程是否还处于运行状态，都要强制中断。
 * @author soft01
 *
 */
public class ThreadDemo2 {
	public static void main(String[] args){
		/*
		 * rose 前台线程
		 */
		 Thread rose =new Thread(){
			public void run(){
				for(int i=0;i<5;i++){
					System.out.println("rose:let me go!");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
				}
				System.out.println("rose:啊啊啊啊AAAAAAAAaaaaaaa...");
				System.out.println("音效：扑通。。。");
			}
		 };
		/*
		 * jack 后台线程
		 */
		 Thread jack=new Thread(){
			 public void run(){
				 while(true){
					 System.out.println("jack:you jump,I jump!");
					 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {                                                                                                                                                                                                       
						e.printStackTrace();
					}
				 }
			 }
		 };
		 rose.start();
		 jack.setDaemon(true);
		 jack.start();
		 System.out.println("main方法结束了！");
		 
	};

}
