package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转数组
 * Collection中提供了一个方法toArray
 * 允许我们将现有的集合转换为数组
 */
public class CollectionToArrayDemo1 {
	public static void main(String[] args){
		Collection<String> c=new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		String[] array=c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(array));
	}
}


