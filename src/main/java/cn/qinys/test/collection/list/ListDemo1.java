package cn.qinys.test.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * List集合
 * 有序集，可重复集
 * List的特点是可以像数组一样，根据下标操作元素
 * 所以List提供了一些独有的方法
 * 常用实现类：
 * ArrayList：内部有数组实现，查询快
 * LinkedList：内部由链表实现，增删快
 * @author soft01
 *
 */
public class ListDemo1 {
	public static void main(String[] args){
		List<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		/*
		 * E get(int index)
		 * 获取指定下标对应的元素。
		 */
		String str=list.get(1);
		System.out.println(str);
		for(int i=0;i<list.size();i++){
			str=list.get(i);
			System.out.println(str);
		}
		/*
		 * E set(int index ,E e)
		 * 将给定的元素设置到指定的位置上，返回值为原位置上的元素。所以该操作是替换元素操作
		 */
		String old=list.set(1, "2");
		System.out.println(list);
		System.out.println("被替换的元素为："+old);
		
		
	}
}
