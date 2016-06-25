package cn.qinys.test.threaddemo.demo1;
/**
 *  练习使用匿名内部类的形式创建线程
 * @author soft01
 */
public class ThreadDemo3 {
	public static void main(String[] args){
		//第一种创建模式
		Thread t1=new Thread(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("你是谁啊？");
				}
			}
		};
		
		//第二种创建模式(线程与任务相对独立了)
		Runnable runn=new Runnable(){
			public void run(){
				for(int i=0;i<100;i++){
					System.out.println("我是查水表的。");
				}
			}
		};
		Thread t2=new Thread(runn);
		t1.start();
		t2.start();
		
		
	}
}
