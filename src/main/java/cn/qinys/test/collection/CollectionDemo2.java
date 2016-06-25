package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合的批量操作
 * @author soft01
 *
 */
public class CollectionDemo2 {
	public static void main(String[] args){
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("php");
		c1.add("c++");
		System.out.println(c1);
		
		Collection c2=new HashSet();
		c2.add("VB");
		c2.add("c#");
		c2.add("OC");
		c2.add("java");
		System.out.println(c2)
		/*
		 * 并集
		 * boolean addAll(Collection c)
		 * 将给定的集合中的所有元素添加大盘当前集合中
		 * 当执行完毕后，当前集合中的元素发生了改变就返回true
		 */;
		c2.addAll(c1);
		System.out.println(c2);
		/*
		 * 判断当前集合中是否包含给定集合里的所有元素，全部包含 就返回true
		 * 这里判断依据依然是依靠元素的edquals比较的
		 * boolean containsAll(Collection c)
		 */
		Collection c3=new ArrayList();
		c3.add("c++");
		c3.add("php");
		boolean contains=c2.containsAll(c3);
		System.out.println("全部包含："+contains);
		
	}
}
