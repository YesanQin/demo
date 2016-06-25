package cn.qinys.test.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 保存一组元素，但是对于存取有要求，必须遵循先进先出原则
 * @author soft01
 *
 */

public class QueueDemo {
	public static void main(String[] args){
		Queue<String> queue=new LinkedList<String>();
		/*
		 * boolean offer(E e)
		 */
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		/*
		 * E poll()
		 * 从对首获取元素。注意，获取后该元素就从队列中被移出了。出队操作！
		 */
		queue.poll();
		System.out.println(queue.poll());//此时输出出来的元素已经是第2个元素了，与28行返回的元素不是同一个
		queue.offer("five");
		System.out.println(queue);
		/*
		 * E peek()
		 * 同样可以获取队首元素，但是与poll不同的是并不会将该元素从队列中删除
		 */
		queue.peek();
		System.out.println(queue.peek());
		System.out.println(queue);
		
		System.out.println("开始遍历！");
		for(int i=queue.size();i>0;i--){
			//注意 当for(int i=0;i<queue.size();i++)时,queue.size()的值是随着执行体的变化而变化的
			//，不能实现预期的循环次数,所以此处利用反向遍历，但不影响元素取出来的顺序，因为队列规定了每个元素的进出顺序
			
			String str=queue.poll();
			System.out.println(str);
		}
		System.out.println(queue);
		
		
	}


}
