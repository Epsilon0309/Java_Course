package Classwork;

public class FirstWordToUppercase {
	
	public static String firstWordToUppercase(String s) {
		String original=s.trim();
		String ans = new String();
		int nextUpper=0;
		for(int i=0;i<original.length();i++) {
			char c= original.charAt(i);
			if(c==' ') {
				nextUpper=i+1;
			}
			if(nextUpper==i) {
				if(c>='a'&& c<='z') {
					c=(char)(c-32);
				}
			}
			ans+=c;
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		String s= "sahil Sombit 123 animesh.";
		System.out.println(firstWordToUppercase(s));
	}
}
