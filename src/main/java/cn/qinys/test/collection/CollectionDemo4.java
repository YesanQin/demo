package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型在集合中的应用
 * 集合中的泛型是用来约束集合中元素的类型
 * @author soft01
 *
 */
public class CollectionDemo4 {
	public static void main(String[] args){
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		Iterator<String> it=c.iterator();
		while(it.hasNext()){
			String str=it.next();
			//如果19行的迭代器没有指定泛型，则此处返回的是Object类型，需要强制转换成String
			System.out.println(str);
		}
		for(String str:c){
			System.out.println(str);
		}
		
		
		
		
	}
}
