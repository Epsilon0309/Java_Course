package ArrayQuestions;

import java.util.ArrayList;

public class LargestSmallestInArray {
	
	public void largestElement(ArrayList<Integer>a) {
		int max = Integer.MIN_VALUE;
		for(Integer b:a) {
			if(max<b) {
				max=b;
			}
		}
		System.out.println(max);
	}
	
	public void smallestElement(ArrayList<Integer>a) {
		int least = Integer.MAX_VALUE;
		for(Integer b:a) {
			if(least>b) {
				least=b;
			}
		}
		System.out.println(least);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(23);
		arr.add(53);
		arr.add(3);
		arr.add(93);
		arr.add(13);
		
		LargestSmallestInArray a = new LargestSmallestInArray();
		a.largestElement(arr);
		a.smallestElement(arr);
	}

}
