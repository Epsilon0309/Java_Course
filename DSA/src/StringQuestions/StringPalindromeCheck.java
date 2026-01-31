package StringQuestions;

public class StringPalindromeCheck {

	//without using stack O(N)
	public static boolean reverseString(String str) {
	    StringBuilder reversed = new StringBuilder();
	    
	    for (int i = str.length() - 1; i >= 0; i--) {
	        reversed.append(str.charAt(i));
	    }
	    
	    return str.equals(reversed.toString());
	}

	public static void main(String[] args) {
		String str1 = "animal";
		String str2 = "racecar";
		
		System.out.println(reverseString(str1));
		System.out.println(reverseString(str2));
		
	}
	
}
