package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingCharacter {
	
    
    public static int getIndex(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = string.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            if (map.get(c) > 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static char getValue(String string) {
    	HashMap<Character, Integer> map = new HashMap<>();
    	char[] ch = string.toCharArray();
    	
    	for (int i = 0; i < ch.length; i++) {
    		char c = ch[i];
    		map.put(c, map.getOrDefault(c, 0) + 1);
    		
    		if (map.get(c) > 1) {
    			return ch[i];
    		}
    	}
    	return '0';
    }

    public static int getIndexSet(String string) {
    	HashSet<Character> set = new HashSet<>();
    	char[] ch = string.toCharArray();
    	
    	for (int i = 0; i < ch.length; i++) {
    		if(set.contains(ch[i])) {
    			return i;
    		}else {
    			set.add(ch[i]);
    		}
    	}
    	return -1;
    }
    
    public static char getValueSet(String string) {
    	HashSet<Character> set = new HashSet<>();
    	char[] ch = string.toCharArray();
    	
    	for (int i = 0; i < ch.length; i++) {
    		if(set.contains(ch[i])) {
    			return ch[i];
    		}else {
    			set.add(ch[i]);
    		}
    	}
    	return '0';
    }


	public static void main(String[] args) {
		String content = "abdjcklbjck";
		System.out.println(getIndex(content));
		System.out.println(getValue(content));
		System.out.println(getIndexSet(content));
		System.out.println(getValueSet(content));
	}
	
}
