package cn.qinys.test.threaddemo.demo2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Thread提供了一个静态方法sleep。该方法可以使运行该方法的线程阻塞指定毫秒。当阻塞时间超时后，该线程
 * 会自动调到Runnable状态，等待再次分配时间片然后运行。
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		while(true){
			System.out.println(sdf.format(new Date()));
			try {
				/*
				 * sleep做不到严格意义上的间隔
				 * 可以保证1秒的阻塞，但是解除阻塞后线程回到Runnable状态，等待分配时间片才能进入running
				 * 状态，这个等待时间就是误差。
				 */
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
