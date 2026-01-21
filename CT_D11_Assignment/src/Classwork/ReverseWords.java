package Classwork;

public class ReverseWords {
	
	public static void reverseWords(String s) {
		StringBuilder ans = new StringBuilder();
		String []s1 = s.split(" ");
		for(int i=s1.length-1;i>=0;i--) {
			ans.append(s1[i]+" ");
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		reverseWords("xyz abc java hi");
	}

}
