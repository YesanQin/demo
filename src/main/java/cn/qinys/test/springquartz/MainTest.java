package cn.qinys.test.springquartz;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("Test start ...");
		String conf = "springquartz.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(conf);
		QuartzJob quartzJob = context.getBean(QuartzJob.class);
		quartzJob.work();
		System.out.println("End start ...");
	}
}
