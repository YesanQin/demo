package cn.qinys.test.collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈：存储一组元素，存取必须遵循先进后出原则
 * 通常用来实现具有“后退”功能的地方
 * @author soft01
 *
 */
public class stackDemo {
	public static void main(String[] args){
		/*
		 * Deque是Queue的字接口
		 * 双端队列的特点是，队列的两端都可以进出元素
		 * 若我们只调用一侧的进出方法，就形成了栈结构
		 */
		Deque<String> stack=new LinkedList<String>();
		/*
		 * void push(E e)
		 * 将元素“压入”栈中，入栈操作。新入栈的元素会在栈顶（栈中第一个元素）
		 */
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		System.out.println(stack);
		/*
		 * E pop()
		 * 出栈操作，获取栈顶元素，获取后该元素就从栈中被删除了
		 */
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
		/*
		 * 同样可以使用peek引用栈顶元素，而不做出栈操作
		 */
		String st=stack.peek();
		System.out.println(st);
		System.out.println(stack);
		
		while(stack.size()>0){
			System.out.println(stack.pop());
		}
		System.out.println(stack);
	}
}








