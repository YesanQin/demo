package cn.qinys.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 使用Arrays的静态方法asList（）
 * 需要注意，数组只能转换为List集合，不能转换为Set
 * 原因在于：
 * 1、Set大部分是无序实现；
 * 2、Set不允许存放重复元素，所以转换后可能丢失元素。
 * @author soft01
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args){
		String[] array=new String[]{"one","two","three"};
		List<String> list=Arrays.asList(array);//数组转换为集合，通过集合来操作元素
		System.out.println(list);
		/*
		 * 修改该集合元素内容，原数组内容也会发生改变
		 */
		list.set(1, "1");
		System.out.println(list);
		//数组的第一个元素也变成了“1”
		System.out.println(Arrays.toString(array));
		
//		list.add("four"); 
		//不能对转换过来的集合做增删操作的，会出现报错，需要对原来色数组进行缩容或扩容！
		//可以通过构建新的集合来操作
		/*
		 * 所有的集合都支持一个构造方法，参数要求传入另一个集合。这个构造方法的作用是：
		 * 创建当前集合的同时将给定的集合中的所有元素添加到当前集合中。
		 */
		List<String> list1=new ArrayList<String>(list);
		list1.add("four");
		System.out.println(list1);
		
		
		
		
		
	}
}
