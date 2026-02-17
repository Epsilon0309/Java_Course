package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapExample {

	public static void main(String[] args) {
		/*
		 parent child = (i-1)/2;
		 
		 left child = 2*i+1;
		 
		 right child = 2*i+2
		 */
		PriorityQueue<Integer>queue = new PriorityQueue<Integer>();// min_heap
		
		queue.offer(1);
		queue.offer(6);
		queue.offer(8);
		queue.offer(9);
		queue.offer(2);
		queue.offer(0);
		
		System.out.println(queue);
		
		List<Integer>list=new  ArrayList<Integer>(queue.size());
		
		//  it will return the element based on the sorted order because it  maintains the min_heap
		while(!queue.isEmpty()) {
			list.add(queue.poll());
		}
		
		System.out.println(list);
		
//		System.out.println(queue.poll());
//		System.out.println(queue.poll());
	}
	
}
