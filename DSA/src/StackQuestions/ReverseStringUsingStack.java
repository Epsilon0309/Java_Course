package StackQuestions;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static String reverseString(String str) {
		char[]c=str.toCharArray();
		Stack<Character>s= new Stack<Character>();
		for(int i=0;i<c.length;i++) {
			s.push(c[i]);
		}
		String ans = "";
		while(!s.isEmpty()) {
			ans+=s.pop();
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "Animal";
		System.out.println(reverseString(str));
	}
}
