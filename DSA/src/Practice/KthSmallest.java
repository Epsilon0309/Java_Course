package Practice;

import java.util.PriorityQueue;

public class KthSmallest {

	public static int KthSmallest(int []a, int k) {
		int min=0;
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		for(int i:a) {
			pq.add(i);
		}
		while(k--<0) {
			min = pq.poll();
		}
		return min;
	}
	
	public static void main(String[] args) {
		
	}
	
}
