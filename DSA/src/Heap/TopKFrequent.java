package Heap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class TopKFrequent {
	
	public static List<Integer> topKfrequentElement(int []nums,int k){
		
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1 );
		}
		
		PriorityQueue<Integer>queue = new PriorityQueue<Integer>(
				(Integer o1,Integer o2)->frequency.get(o1)-frequency.get(o2)
				);
		
		Set<Integer>key = frequency.keySet();
		
		for(Integer element: key) {
			queue.add(element);
			
			if(queue.size()>k) {
				queue.poll();
			}
		}
		

        return new ArrayList<Integer>(queue);
	}

	public static void main(String[] args) {
		
		int[]a1 = {1,2,1,1,2,2,4,1,4,6};
		int k=2;
		
		System.out.println(topKfrequentElement(a1, k));
		
		
        int a=30,b=67;
        BigInteger A= BigInteger.valueOf(33); //argument is long
        BigInteger B= BigInteger.valueOf(676769636);
        int c=B.intValue(); //convert BigInt to integer
        BigInteger C= new BigInteger("6386612187169369696923693726");
        BigInteger X = new BigInteger("63696966986612187169369696923693726");
        BigInteger D= BigInteger.TEN;

        BigInteger sum=B.add(X);
        System.out.println(sum);

        BigInteger mul= X.multiply(X);
        System.out.println(mul);

        System.out.println(C.bitCount());
        System.out.println(C.divide(D));
        //-1, 0 or 1 as this BigInteger is numerically less than, equal to, or greater than val.
        System.out.println(C.compareTo(X));
	}
	
	
	
}
