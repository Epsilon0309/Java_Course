package Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKMaximunElement {
	
	public static List<Integer> topKMaximumElement(int []nums,int k){
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			frequency.put(nums[i], frequency.getOrDefault(nums[i],0)+1 );
		}
		
		ArrayList<Integer>key = new ArrayList<Integer>(frequency.keySet());
		key.sort((a, b) -> a - b);
		int length= key.size()-1;
		
		ArrayList<Integer>ans = new ArrayList<Integer>();
		
		while(k!=0) {
			ans.add(key.get(length));
			length--;
			k--;
		}
		//System.out.println(key);
        return ans;
	}

	public static void main(String[] args) {
		int[]a = {1,8,8,8,8,8,8,8,8,2,1,1,2,2,4,1,4,7,6};
		int k=2;
		
		System.out.println(topKMaximumElement(a, k));
	}
	
}
