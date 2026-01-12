package Conditional_statement;

public class BiggestOf3 {
	public static void main(String[] args) {
		int a = 10, b = 15, c = 20;
		// approach 1
		if (a > b) {
			if (a > c) {
				System.out.println("A " + a);
			} else {
				System.out.println("C " + c);
			}
		} else {
			if (b > c) {
				System.out.println("B " + b);
			} else {
				System.out.println("C " + c);
			}
		}

		// approach 2
		if (a > b && a > c) {
			System.out.println("A " + a);
		} else {
			if (b > c) {
				System.out.println("B " + b);
			} else {
				System.out.println("C " + c);
			}
		}

		// approach 3
		int biggest = (a > b) ? a : b;
		if (biggest > c) {
			System.out.println(biggest);
		} else {
			System.out.println(c);
		}
	}
}
