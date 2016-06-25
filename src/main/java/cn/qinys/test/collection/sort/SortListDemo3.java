package cn.qinys.test.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Collections的重载sort方法
 */
public class SortListDemo3 {
	
	public static void main(String[] args){
		List<String> list=new ArrayList<String>();
		list.add("苍老师");
		list.add("小泽老师");
		list.add("范老师");
		System.out.println(list);
		/*
		 * Comparator是抽象类，使用之前先构建其子类对象
		 * 此处利用了匿名内部类来实现，因为只使用其对象一次
		 */
		Comparator<String> com=new Comparator<String>(){

//			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length()-o2.length();
			}
			
		};
		Collections.sort(list,com);
		/*
		 * Collections的重载sort方法要求我们传入来年各个参数：
		 * 1、待排序的集合
		 * 2、比较器
		 * 通常有两种情况会使用该方法排序集合
		 * 1、元素已经实现了Comparable接口，但是比较大小的规则不能满足我们对于排序的额要求时
		 * 2、元素没有实现Comparable接口，并且也不希望为了这里排序而强制修改元素，要求其实现接口时
		 */
		System.out.println(list);
	}
}

