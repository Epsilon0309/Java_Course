package Practice;

import java.util.Stack;

public class ValidPrenthesis {

	public static boolean validParenthesis(String s) {
		boolean ans = true;
		Stack<Character>stack= new Stack<Character>();
	
		char[]ch= s.toCharArray();
		stack.push(ch[0]);
		for(int i=1;i<ch.length;i++) {
			if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[') {
				stack.push(ch[i]);
			}
			else if(ch[i]==')' && stack.peek()=='(') {
				stack.pop();
			}
			else if(ch[i]=='}' && stack.peek()=='{') {
				stack.pop();
			}
			else if(ch[i]==']' && stack.peek()=='[') {
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) {
			ans=false;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(validParenthesis("({[]})"));
		System.out.println(validParenthesis("({[{]})"));
	}
	
}
