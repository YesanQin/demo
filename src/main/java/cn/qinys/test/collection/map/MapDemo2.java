package cn.qinys.test.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


/**
 * 遍历Map
 * 遍历Map有三种方式：
 * 1、遍历所有的key
 * 2、遍历每一组键值对
 * 3、遍历所有的value（相对不常用）
 * @author soft01
 *遍历Map集合里面的元素主要有两种方式：
 *一种是通过Entry获取键值对集合
 *第二种是同keySet获取key值集合，再通过key值获取对应的values
 */
public class MapDemo2 {
	public static void main(String[] args){
		/*
		 * LinkedHashMap
		 * 内部使用一个LinkedList维护顺序，可以做到遍历的时候与put的顺序一样。
		 * 若不许要顺序，通常不使用该类。
		 */
//		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("语文",98);
		map.put("数学",95);
		map.put("英语",97);
		map.put("物理",93);
		map.put("化学",91);
		/*
		 * 遍历所有的key
		 * Set<K> keySet()
		 * 该方法会将所有的key存入一个Set集合后返回，所以遍历该集合就相当于遍历到所有的key了
		 */
	 Set<String> keyset= map.keySet();
	 for(String str:keyset){
		 System.out.println(str+","+map.get(str));
	 }
	 /*
	  *遍历每一组键值对
	  *Set<Entry> entrySet()
	  *Entry是Map的内部类，每一个实例表示一组键值对
	  *其中包含两个属性，key，value
	  *将每一组键值对（Entry实例）存入一个Set集合后将其返回。 
	  */
	 Set<Entry<String,Integer>> entrySet=map.entrySet();
	 for(Entry<String,Integer> e:entrySet){
		 String key=e.getKey();
		 Integer value=e.getValue();
		 System.out.println(key+","+value);
	 }
	 /*
	  * Collection<V> values()
	  * 将当前Map中所有的value值存入一个集合后返回
	  */
	 Collection<Integer> values=map.values();
	 for(Integer value: values){
		 System.out.println("value:"+value);
	 }
	}
}





