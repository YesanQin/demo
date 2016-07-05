package cn.qinys.test.others;

public class Parent {
	private String name = CommonUtil.getValue("父类非静态变量赋值：qinys");
	
	private String age;

	private static String appVersion = CommonUtil.getValue("父类静态变量赋值：5.5.0version");

	public Parent() {
		System.out.println("父类构造方法执行");
	}

	static {
		System.out.println("父类静态块执行");
	}

	{
		System.out.println("父类非静态块执行");
	}
}
