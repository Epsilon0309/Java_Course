package Common_Problems;

public class CheckUppercaseLowercase {
	public static void main(String[] args) {
		char s = 'Z';
		
		//char compare
		if(s>='a'&&s<='z') {
			System.out.println("Lowercase");
		}
		if(s>='A'&&s<='Z') {
			System.out.println("Uppercase");
		}
		
		// ASCII compare 
		int value = s;
		if(value>=65 && value<=90) {
			System.out.println("Uppercase");
		}
		if(value>=97 && value<=123) {
			System.out.println("Lowercase");
		}
	}
}
