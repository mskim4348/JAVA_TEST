package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {

		QueueTest queuetest = new QueueTest();
		
		queuetest.enQueue("A");
		queuetest.enQueue("B");
		queuetest.enQueue("C");

		System.out.println(queuetest.deQueue());
		System.out.println(queuetest.deQueue());
		System.out.println(queuetest.deQueue());

		Queue<String> queue = new LinkedList<String>();
		LinkedList<String> link=new LinkedList<String>();
		
		System.out.println(queue.size());
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");

		System.out.println(queue.getClass().getName())
		System.out.println(queue.peek());
		System.out.println("peek() 실행시 사이즈:"+queue.size());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("poll() 실행시 사이즈:"+queue.size());
	}
}
