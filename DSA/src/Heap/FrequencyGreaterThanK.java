package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FrequencyGreaterThanK {
	
	public static List<Integer> frequencyGreaterThanK(int []nums,int k){
		List<Integer>ans = new ArrayList<Integer>();
		PriorityQueue<Integer>queue = new PriorityQueue<Integer>();
		for(int a:nums) {
			queue.offer(a);
		}
		
		int previousCount = 0; int previousElement =-1;
        while (!queue.isEmpty()) {
            if (queue.peek() != previousElement) {
                if (previousElement != -1 && previousCount >= k) {
                    ans.add(previousElement);
                }
                previousElement = queue.poll();
                previousCount = 1; 
            } else {
                queue.poll();
                previousCount++;
            }
        }
        
        if (previousCount >= k) {
            ans.add(previousElement);
        }
        
        return ans;
	}

	public static void main(String[] args) {
		
		int[]a = {1,2,1,1,2,2,4,1,4,6};
		int k=2;
		
		System.out.println(frequencyGreaterThanK(a, k));
	}
	
}
