package cn.qinys.test.stringdemo.demo2;
/**
 * 数字类型的包装类都支持两个常量
 * MAX—VALUE，MIN—VALUE
 * 分别用来表示其对应的基本类型的取值范围
 * @author soft01
 *
 */

public class IntegerDemo2 {
	public static void main(String[] args){
	int max=Integer.MAX_VALUE;
	int min=Integer.MIN_VALUE;
	System.out.println("最大取值："+max);
	System.out.println("最小取值："+min);
	}
}
