package Classwork;

public class SwapFirstLastChharOfWord {
	public static String firstLastSwap(String s) {
		char[]ch = s.toCharArray();
		char temp = ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		String ans = new String(ch);
		return ans;
	}
	
	public static String fisatLastCharOfWordSwap(String s) {
		String ans = new String();
		String []s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			s1[i]=firstLastSwap(s1[i]);
			ans=ans+s1[i]+" ";
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		String s= "Java hi";
		System.out.println(fisatLastCharOfWordSwap(s));
	}
}
