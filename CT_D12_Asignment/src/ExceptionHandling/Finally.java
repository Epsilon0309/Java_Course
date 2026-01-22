package ExceptionHandling;

public class Finally {
public static void main(String[] args) {
	System.out.println(m1());
}
public static int m1() {
	try {
		System.out.println(1);
		System.out.println(7/2);
		System.out.println(1);
		//return 1;
		
	}
	catch (ArithmeticException e) {
		System.out.println("handled");
	}
	finally {
		System.out.println("finally block");
	}
	
	return 9;
}
}
