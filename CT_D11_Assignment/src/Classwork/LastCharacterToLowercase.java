package Classwork;

public class LastCharacterToLowercase {
	
	public static String lastCharLowerCase(String s) {
		char[]ch = s.toCharArray();
		if(ch[ch.length-1]<'a') {
			ch[ch.length-1]=(char)(ch[ch.length-1]+32);
		}
		
		String ans = new String(ch);
		return ans;
	}
	
	public static String lastCharOfWordToLower(String s) {
		String ans = new String();
		String []s1 = s.split(" ");
		for(int i=0;i<s1.length;i++) {
			s1[i]=lastCharLowerCase(s1[i]);
			ans=ans+s1[i]+" ";
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		String s= "sahiL aNImesL diptyoniL";
		System.out.println(lastCharOfWordToLower(s));
	}

}
