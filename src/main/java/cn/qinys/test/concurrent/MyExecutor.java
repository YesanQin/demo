package cn.qinys.test.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor extends Thread{
	private int index;
	public MyExecutor(int i){
		this.index=i;
	}
	public void run(){
		try {
			System.out.println("线程："+this.index+"start...");
			Thread.sleep((int)Math.random()*100000);
			System.out.println("线程"+this.index+"end...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecutorService list = Executors.newFixedThreadPool(4);
		for(int i=0;i<10;i++){
			list.submit(new MyExecutor(i));
//			list.execute(new MyExecutor(i));
		}
		System.out.println("submit finish");
		list.shutdown();
	}
}
