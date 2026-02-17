package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumbers {
	
	public static HashMap<Integer, Integer> frequency(int[]a){
		HashMap<Integer, Integer>ans = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < a.length; i++) {
            int c = a[i];
            ans.put(c, ans.getOrDefault(c, 0) + 1);
        }
        return ans;
	}
	
	public static void main(String[] args) {
		int[]a = {1,2,3,1,2,3,5,6,3,2,6};
		HashMap<Integer, Integer>ans = frequency(a);
		
		System.out.println(ans);
		
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        // put ans put if absent will retuen the previous value
        // get also returns null or the node
	}

}
