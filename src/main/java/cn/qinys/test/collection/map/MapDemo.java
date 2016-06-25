package cn.qinys.test.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map
 * Map看起来像是一个多行两列的表格
 * 每条记录分为两部分：key,value
 * 其中在意个Map中key是不允许重复的。（equals比较）
 * 
 * 常用的实现类：java.util.HashMap(散列算法实现)
 * TreeMap（二叉树实现）
 * @author soft01
 *
 */
public class MapDemo {
	public static void main(String[] args){
		Map<String,Integer> map=new HashMap<String,Integer>();
		/*
		 * V put(K k,V v)
		 * 将给定的key与value存入到Map中
		 * 由于Map中key不能重复，所以会出现两种情况：
		 * 1、存入的key在Map中还不存在，那么直接将这对key-value存入Map，返回值为NULL
		 * 2、存入的key在Map中已经存在，那么会将对应的value替换原来这个key
		 * 对应的value，并将被替换的value值返回
		 */
		map.put("语文",97);
		map.put("数学",94);
		map.put("英语",92);
		map.put("化学",93);
		map.put("物理",98);  
		/*
		 * 存入顺序与内部顺序不一致
		 */
		System.out.println(map);
		Integer in=map.put("化学", 97);//有返回值
		System.out.println(in);
		System.out.println(map);
		/*
		 * V get(K k)
		 * 根据给定的key去获取对应的value
		 * 若当前Map中不含有给定的key，则返回值为NULL
		 */
		Integer num=map.get("数学");
		System.out.println("数学："+num);
		/*
		 * V remove(K k)
		 * 将给定的key对应的这一对内容从Map中删除
		 * 并将对应的value返回。
		 */
		Integer im=map.remove("语文");
		System.out.println("删除的value："+im);
		System.out.println(map);
		/*
		 * boolean containsKey(K k)
		 * 查看当前Map是否包含给定的key
		 * 包含的判断是依据key的equals比较的结果。
		 */
		boolean flag=map.containsKey("数学");
		System.out.println(flag);
		
		
		
		
		
		
		
		
		

	
	}
}









