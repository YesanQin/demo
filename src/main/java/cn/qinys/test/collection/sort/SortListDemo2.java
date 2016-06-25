package cn.qinys.test.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cn.qinys.test.collection.entity.Point;

public class SortListDemo2 {
	public static void main(String[] args){
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(9,5));
		list.add(new Point(3,2));
		list.add(new Point(6,4));
		System.out.println(list);
		/*
		 * Collection的sort方法若希望对集合进行排序，必须保证集合中的元素是可比较大小的
		 * 所以要求元素必须实现Comparable接口，并重写其中的比较大小方法，才可以进行排序。
		 */
		Collections.sort(list);
		System.out.println(list);
		/*
		 * 虽然sort方法可以对集合中的元素进行自然排序，但是必须要求元素实现 Comparable接口，这
		 * 就出现了由于想使用排序功能而必须改变我们定义的类的内容，这中现象称为“侵入性”。
		 */
	}

}
