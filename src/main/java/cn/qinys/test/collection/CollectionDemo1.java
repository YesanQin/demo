package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Collection;

import cn.qinys.test.collection.entity.EmpTest;

/**
 * 集合提供了一个方法可以删除集合中的现有元素
 * boolean remove(E e)
 * 将给定的元素从集合中删除，成功删除返回true
 * @author soft01
 */
public class CollectionDemo1 {
	public static void main(String[] args){
		Collection c=new ArrayList();
		c.add(new EmpTest("张三",25,"男",5000));
		c.add(new EmpTest("李四",26,"女",6000));
		c.add(new EmpTest("王五",27,"男",7000));
		c.add(new EmpTest("张三",25,"女",2600));
		/*
		 *  删除元素的判断依据是，删除当前集合中第一个与
		 *  给定元素equals比较为true的。
		 */
		System.out.println(c);
		EmpTest e=new EmpTest("张三",25,"女",2600);
		c.remove(e);
		System.out.println(c);
	}
}
