package Basic;

import java.util.Stack;

public class ValidPrenthesis {

	public boolean validParenthesis(String str) {
		char[] s = str.toCharArray();
		Stack<Character> parenthesis = new Stack<Character>();
		for (char c : s) {
	        if (c == '(' || c == '{' || c == '[') {
	            parenthesis.push(c);
			} else if (c == ')') {
				if (parenthesis.isEmpty() || parenthesis.peek() != '(') {
					return false;
				}
				parenthesis.pop();
			} else if (c == '}') {
				if (parenthesis.isEmpty() || parenthesis.peek() != '{') {
					return false;
				}
				parenthesis.pop();
			} else if (c == ']') {
				if (parenthesis.isEmpty() || parenthesis.peek() != '[') {
					return false;
				}
				parenthesis.pop();
			}

		}
		return true;
	}
	
	public static void main(String[] args) {
		
		ValidPrenthesis v= new ValidPrenthesis();
		String str = "[{()}]";
		String str1 = "[{(})]";
		
		System.out.println(v.validParenthesis(str));
		System.out.println(v.validParenthesis(str1));
	}

}
