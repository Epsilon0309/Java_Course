package Classwork;

public class CountOfAlphabetDigitSpecialChar {
	
	public static void countOfAlphabetDigitChar(String s) {
		int alphabet=0;int digit=0;int specialChar=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0'&&c<='9') {
				digit++;
			}
			else if(c>='a'&&c<='z'||c>='A'&&c<='z') {
				alphabet++;
			}
			else {
				specialChar++;
			}
		}
		
		System.out.println("alphabet: "+alphabet);
		System.out.println("digit: "+digit);
		System.out.println("specialchar: "+specialChar);
	}
	
	public static void main(String[] args) {
		String s = "abc23@#$gf";
		countOfAlphabetDigitChar(s);
		
	}

}
