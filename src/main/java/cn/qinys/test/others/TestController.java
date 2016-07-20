package cn.qinys.test.others;
public class TestController {
	/**
	 * @param args
	 * @history 2016年7月18日 上午1:18:07
	 * @qinys zxqinlang@126.com
	 */
	public static void main(String[] args) {
//		Child child = new Child();
		
		/*
		 * 重写 运行期绑定
		 */
		Child1 child1 = new Child1();
		child1.say();
		Parent1 parent1 = new Child1();
		parent1.say();
		Parent1 parent12 = new Parent1();
		parent12.say();
	}
}
