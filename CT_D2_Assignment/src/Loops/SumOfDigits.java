package Loops;

public class SumOfDigits {
	public static void main(String[] args) {
		int a = 123;
		int sum = 0;
		
		// using while
		while (a > 0) {
			int rem = a % 10;
			sum += rem;
			a = a / 10;
		}
		System.out.println(sum);
		
		//using do-while
		int b=1234;
		int add=0;
		do {
			int rem=b%10;
			add+=rem;
			b=b/10;
		}
		while(b>0);
		System.out.println(add);
	}
}
