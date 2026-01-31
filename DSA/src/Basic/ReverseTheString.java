package Basic;

import java.util.Stack;

public class ReverseTheString {
	
	//without using stack O(N)
	public static StringBuilder reverseStringBrute(String str) {
		StringBuilder ans = new StringBuilder();
		for(int i=str.length()-1; i>=0;i--) {
			ans.append(str.charAt(i));
		}
		return ans;
	}

	//using stack O(2N)
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
	
	//without using stack O(N)
	public static String reverseStringOptimal(String str) {
		char[]c=str.toCharArray();
		int start=0;int end=c.length-1;
		while(start<=end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;end--;
		}
		String ans = new String(c);
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(reverseString(str));
		System.out.println(reverseStringOptimal(str));
		System.out.println(reverseStringBrute(str));
	}
	
}
