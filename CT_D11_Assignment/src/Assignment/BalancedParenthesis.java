package Assignment;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String str = "(())";
		int count=0;
		boolean isBalanced =true;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				count++;
			}
			else if(ch==')') {
				count--;
			}
			if(count<0) {
				isBalanced = false;
			}
		}
	}
	
}
