package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueElement {

	public static ArrayList<Integer> uniqueElements(int[]a) {
		HashMap<Integer, Integer>answer = new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
	        if (answer.get(a[i]) == null) {
	            answer.put(a[i], 1); 
	        }
	    }

	    return new ArrayList<>(answer.keySet());

	}
	
	public static void main(String[] args) {
		
		int[]a = {1,2,3,4,3,2,5,6,4,3,5,7,8,1,2,3,4};
		
		System.out.println(uniqueElements(a));
		
	}
	
}
