package MethodsWithReturnType;

public class Calculator {

	public static long add(int a, int b) {
		long res =(long)a + b;
		return res;
	}

	public static int subtract(int a, int b) {
		int res = a - b;
		return res;
	}

	public static int multiply(int a, int b) {
		int res = a * b;
		return res;
	}

	public static float divide(int a, int b) {
		float res = (float) a / b;
		return res;
	}

	public static void main(String[] args) {

		char choice = '+';
		int a = 2147483647, b = 11;

		switch (choice) {

		case '+': {
			long ans = add(a, b);
			System.out.println("Result: " + ans);
		}
			break;

		case '-': {
			int ans = subtract(a, b);
			System.out.println("Result: " + ans);
		}
			break;

		case '*': {
			int ans = multiply(a, b);
			System.out.println("Result: " + ans);
		}
			break;

		case '/': {
			float ans = divide(a, b);
			System.out.println("Result: " + ans);
		}
			break;

		default: {
			System.out.println("Operation not available");
		}

		}
	}

}
