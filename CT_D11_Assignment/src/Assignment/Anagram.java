package Assignment;

import java.util.Arrays;

public class Anagram {

	public static void checkAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[]ch1 = s1.toCharArray();
		char[]ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String s3 = new String(ch1);
		String s4 = new String(ch2);
		if(s3.equals(s4)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not anagram");
		}
	}
	
	public static void main(String[] args) {
		String s1= "ListEn";
		String s2= "Silent";
		checkAnagram(s1,s2);
	}
}
