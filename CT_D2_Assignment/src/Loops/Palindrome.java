package Loops;

public class Palindrome {
public static void main(String[] args) {
	int a = 1232; int c=a;
	int b = 0;
	while (a > 0) {
		int rem = a % 10;
		b =(b*10)+ rem;
		a = a / 10;
	}
	if(c==b) {
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not Palindrome");
	}

}
}
