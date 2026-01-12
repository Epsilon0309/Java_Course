package Conditional_statement;

public class Calculator {
	public static void main(String[] args) {
		int a = 20, b = 10;
		char operator = '-';
		switch (operator) {
		case '+': {
			System.out.println("Summation: " + (a + b));
		}
			break;
		case '-': {
			System.out.println("Subtraction: " + (a - b));
		}
			break;
		case '*': {
			System.out.println("Multiplication: " + (a * b));
		}
			break;
		case '/': {
			System.out.println("Division: " + (a / b));
		}
			break;
		default: {
			System.out.println("No operator");
		}
		}
	}
}
