package cn.qinys.test.threaddemo.demo1;
/**
 * 获取线程状态的相关方法
 * @author soft01
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args){
		Thread t=Thread.currentThread();
		//获取线程id
		System.out.println("id:"+t.getId());
		//获取线程名称
		System.out.println("name:"+t.getName());
		//获取线程优先级别
		System.out.println("priority:"+t.getPriority());
		//获取线程是否处于活动状态
		System.out.println("isAlive:"+t.isAlive());
		//获取线程是否为守护状态（后台线程）
		System.out.println("isDaemon:"+t.isDaemon());//true表示是守护线程
		//获取线程是否为中断状态
		System.out.println("isInterrupted:"+t.interrupted());
	}
}
