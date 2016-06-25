package cn.qinys.test.threaddemo.demo1;

public class TestPerson {
	public static void main(String[] args){
		Person p=new Person();
		
		try {
			/*
			 * 当一个方法上使用throws声明抛出某些异常时，我们在调用该方法时要求必须处理这些异常
			 * 处理手段有两种：
			 * 1、自行try-catch捕获并处理
			 * 2、在当前方法上继续使用thrwos声明将这些异常抛出
			 */
			p.setAge(1000);
		} catch (IllegalAgeException e) {
		    System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		
		System.out.println("年龄是："+p.getAge());
	}
}
