package cn.qinys.test.timedemo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 判断集合是否含有给定元素
 * @author soft01
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args){
		Collection c=new ArrayList();
		c.add(new EmpTest("张三",25,"男",5000));
		c.add(new EmpTest("李四",26,"女",6000));
		c.add(new EmpTest("王五",22,"男",7000));
	   EmpTest e=new EmpTest("王五",22,"男",7000);
	   
	   System.out.println(c); //元素的toString方法被重写
	   //输出结果为：[张三,25,男,5000.0。, 李四,26,女,6000.0。, 王五,22,男,7000.0。]
	  //若元素的toString方法没有被重写
	 //[day03.EmpTest@1606bf5, day03.EmpTest@14fcc96, day03.EmpTest@bcbc]
	   //Collection方法被重写了
		boolean f=c.contains(e);//此处Emp的equals方法也被重写了
		System.out.println(f);
		
	}

}
