package ExceptionHandling;

public class Throws {
	
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("hii");
		Class.forName("ExceptionHandling.exceptionHandling");
		System.out.println("bye");
	}

}
