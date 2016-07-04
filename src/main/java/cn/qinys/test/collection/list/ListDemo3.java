package cn.qinys.test.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author soft01
 *
 */
public class ListDemo3 {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i);
		}
		//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		System.out.println(list);
		/*
		 * List subList(int start,int end)
		 * 获取当前集合中给定范围内的部分子集。
		 */
		List<Integer> subList=list.subList(3,8);
		System.out.println(subList);
		/*
		 * 将子集中的每个元素扩大10倍
		 */
		for(int i=0;i<subList.size();i++){
			subList.set(i,subList.get(i)*10);
		}
		System.out.println(subList);
		System.out.println(list);
		/*
		 * 对子集的任何操作都会影响原集合
		 * 快速删除集合中的部分元素，可以先将它们一起取出来，然后通过clear方法一次性删除
		 */
		subList.clear();
		System.out.println(list);
		
	}
}
