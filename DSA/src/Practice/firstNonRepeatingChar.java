package Practice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class firstNonRepeatingChar {

	public static char firstNonRepeatingChar(String s) {
		char[]ch= s.toCharArray();
		LinkedHashMap<Character, Integer>map1 = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			map1.put(ch[i], map1.getOrDefault(map1, 0)+1);
		}
		
		for(Entry<Character, Integer> entry:map1.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		
		return ' ';
		
	}
	
}
