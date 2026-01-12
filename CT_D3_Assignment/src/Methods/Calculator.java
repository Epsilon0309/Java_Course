package Methods;

public class Calculator {
	// method definition
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void divide(int a, int b) {
		System.out.println((float) a / b);
	}

	public static void main(String[] args) {
		add(10, 20);
		subtract(10, 20);
		multiply(10, 20);
		divide(10, 20);// method call statement
	}
}
