package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class CollectionDemo3 {
	public static void main(String[] args){
		Collection c=new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		System.out.println(c);
		/*
		 * 若需要遍历集合，可以调用集合的方法
		 * Iterator interator()
		 * 该方法会返回可以遍历当前集合的迭代器
		 */
		Iterator it=c.iterator();
		while(it.hasNext()){
			String str=(String)it.next();
			it.remove();
			System.out.println(str);
		}
		System.out.println(c);
	}
}








