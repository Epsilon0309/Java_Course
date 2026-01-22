package ExceptionHandling;

public class exceptionHandling {
	
	public static void main(String[] args) {
		System.out.println("hii");
		
		try {
			System.out.println(7/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Zero");
		}
		
		System.out.println("bye");
	}

}
