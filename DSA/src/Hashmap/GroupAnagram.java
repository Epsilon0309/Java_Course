package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	public List<List<String>> groupAnagram(String[]words){
		HashMap<String, List<String>>ans = new HashMap<String, List<String>>();
		for(String s:words) {
			char[]ch=s.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(!ans.containsKey(key)) {
				ans.put(key, new ArrayList<String>());
			}
			ans.get(key).add(s);
		}
		
		return new ArrayList<>(ans.values());
	}
	
	public static void main(String[] args) {
		
		String []words = {"tea","eat","tan","tab","ate","nat","bat"};
		
		GroupAnagram ga = new GroupAnagram();
		
		List<List<String>>lists = ga.groupAnagram(words);
		
		System.out.println(lists);
		
	}

}
