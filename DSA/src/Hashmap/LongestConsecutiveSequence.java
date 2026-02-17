package Hashmap;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[]arr) {
		HashSet<Integer>nums = new HashSet<>();
		for(int element:arr) {
			nums.add(element);
		}
		int max=0;
		for(int number:nums) {
			if(!nums.contains(number-1)) {
				int currentNum=number;
				int count=1;
				while(nums.contains(currentNum+1)) {
					currentNum++;count++;
				}
				
				max= Math.max(max, count);
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		int[]a = {1,4,100,3,2,200,201};
		
		System.out.println(longestConsecutive(a));
	}
	
}
