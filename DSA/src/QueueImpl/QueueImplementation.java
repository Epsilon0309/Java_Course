package QueueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue<Integer>queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue);
		
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
//		System.out.println(queue.remove());
		
		//System.out.println(queue.remove());//no such element exception
		
		for(int element:queue) {
			System.out.println(element);
		}
		System.out.println(queue.size());
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue.size());
		
	}
	
}
