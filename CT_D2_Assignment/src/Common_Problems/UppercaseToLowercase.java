package Common_Problems;

public class UppercaseToLowercase {
	public static void main(String[] args) {
		char ch = 'M';
		int ascii = ch - 'A' + 'a';
		char ans = (char) ascii;
		System.out.println(ans);
	}
}
