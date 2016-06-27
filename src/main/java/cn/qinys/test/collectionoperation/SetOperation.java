package cn.qinys.test.collectionoperation;

import java.util.HashSet;
import java.util.Set;

public class SetOperation
{
	public static void main(String[] args)
	{
		Set<String> set1 = new HashSet<String>();
		set1.add("1");
		set1.add("2");
		set1.add("3");
		set1.add("4");
		set1.add("5");
		Set<String> set2 = new HashSet<String>();
		set2.add("3");
		set2.add("4");
		set2.add("5");
		set2.add("6");
		set2.add("7");
		Set<String> result = new HashSet<String>();
		System.out.println("可以看到：HashSet不维护元素的顺序~");
		System.out.println("set1集合：\t"+set1);
		System.out.println("set2集合：\t"+set2);
		
		result.clear();
		result.addAll(set1);
		result.retainAll(set2);
		System.out.println("交集：\t\t"+result);
		
		result.clear();
		result.addAll(set1);
		result.removeAll(set2);
		System.out.println("set1-set2差集：\t"+result);
		
		result.clear();
		result.addAll(set2);
		result.removeAll(set1);
		System.out.println("set2-set1差集：\t"+result);
		
		result.clear();
		result.addAll(set1);
		result.addAll(set2);
		System.out.println("并集：\t\t"+result);
	}
}
