package StackQuestions;

import java.util.Stack;

public class PalindromeCheckUsingStack {

	public static boolean palindromeCheckUsingStack(String str) {
		boolean ans =true;
		String original = str;
		char[]c=str.toCharArray();
		Stack<Character>s= new Stack<Character>();
		for(int i=0;i<c.length;i++) {
			s.push(c[i]);
		}
		String reversed = "";
		while(!s.isEmpty()) {
			reversed+=s.pop();
		}
		if(!original.equals(reversed)) {
			ans = false;
			return ans;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "Animal";
		String str1="racecar";
		System.out.println(palindromeCheckUsingStack(str));
		System.out.println(palindromeCheckUsingStack(str1));
	}
	
}
