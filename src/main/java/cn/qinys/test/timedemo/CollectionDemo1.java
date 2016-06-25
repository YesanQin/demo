package cn.qinys.test.timedemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * java.util.Collection
 * 集合，用于存放一组元素。提供了若干功能，比数组使用方便。
 * @author soft01
 *
 */
public class CollectionDemo1 {
	public static void main(String[] args){
		Collection c=new ArrayList();
		/*
		 * boolean add(E e)
		 * 将当前集合中添加给定的元素,若成功添加则返回true
		 */
//		c.add("safd");
//		c.add(1);
//		c.add(new Date());
		c.add("one");
		c.add("two");
		c.add("three");
		/*
		 * int size()
		 * 获取当前集合中的元素个数
		 */
		System.out.println("SIZE:"+c.size());
		c.add("four");
		System.out.println("SIZE:"+c.size());
		/*
		 * boolean isEmpty()
		 * 判断当前集合是否不包含任何元素,当集合中没有元素是返回true
		 */
		boolean isEmpty=c.isEmpty();
		System.out.println("集合是否不含有元素："+isEmpty);
		c.clear();
		boolean isEmpty1=c.isEmpty();
		System.out.println("SIZE:"+c.size());
		System.out.println("集合是否不含有元素："+isEmpty1);
		
	}
}







