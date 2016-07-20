package cn.qinys.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 */
import cn.qinys.test.spring.bean.Student;

/**
 * @qinys zxqinlang@126.com
 * @history 2016年7月20日 下午11:35:48
 * Spring的容器管理，想获得什么对象，就需要在xml文件中配置注册该对象
 */
public class SpringDemo {
	public static void main(String[] args) {
		String configPath = "spring-application.xml";
		ApplicationContext springContainer= new ClassPathXmlApplicationContext(configPath);
		System.out.println(springContainer.getBean("student"));
	}
}
