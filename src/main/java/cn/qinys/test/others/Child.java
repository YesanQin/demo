package cn.qinys.test.others;

public class Child extends Parent {
	private String sex;
	
	private static String aa = CommonUtil.getValue("子类静态变量赋值：aa");;

	private String bb = CommonUtil.getValue("子类非静态变量赋值：bb");;

	public Child() {
		System.out.println("子类构造方法执行");
	}

	static {
		System.out.println("子类静态块执行");
	}

	{
		System.out.println("子类非静态块执行");
	}
}
