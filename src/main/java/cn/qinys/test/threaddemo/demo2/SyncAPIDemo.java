package cn.qinys.test.threaddemo.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 将集合或Map转换为线程安全的
 * @author soft01
 *
 */
public class SyncAPIDemo {
	public static void main(String[] args){
		/*
		 * ArrayList,LinkedList都不是线程安全的
		 */
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		/*
		 * 将list的集合转换为一个线程安全的
		 */
		list=Collections.synchronizedList(list);
		System.out.println(list);
		/*
		 *  将set集合转换为线程安全的
		 */
		Set<String> set=new HashSet<String>();
		set=Collections.synchronizedSet(set);
		/*
		 * HashMap不是线程安全的
		 */
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文",98);
		//转换为线程安全的Map
		map=Collections.synchronizedMap(map);
		
	}
}
