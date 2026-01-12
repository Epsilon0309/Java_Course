package Conditional_statement;

public class ChataogryOfChar {
public static void main(String[] args) {
	char c='A';
	if((c>='A'&& c<='Z')||(c>='a'&& c<='z')) {
		System.out.println("Albhabet");
	}
	else if(c>=0&&c<=9) {
		System.out.println("Digit");
	}
	else {
		System.out.println("Special Character");
	}
}
}
