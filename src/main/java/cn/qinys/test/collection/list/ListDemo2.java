package cn.qinys.test.collection.list;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * List提供的另一对方法
 * void add(int index,E e)
 * 项指定位置插入给定的元素，原位置及后续元素的顺序向后移动
 * 
 * E remove(int index)
 * 删除并返回给定位置的元素。
 * @author soft01
 *
 */
public class ListDemo2 {
	public static void main(String[] args){
	List<String> list=new LinkedList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	//[one, two, three, four]
	System.out.println(list);
	//
	list.add(2,"3");
	System.out.println(list);
	//
	String old=list.remove(3);
	System.out.println(list);
	System.out.println("被删除的元素是："+old);
	
	
	
	
	}
}
