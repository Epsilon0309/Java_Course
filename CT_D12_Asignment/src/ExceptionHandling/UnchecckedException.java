package ExceptionHandling;

public class UnchecckedException {

	public static void main(String[] args) {
		System.out.println("hii");
		try {
			System.out.println(7/7);
			Class.forName("ExceptionHandling.exceptionHandling");
			String s= null;
			s.toLowerCase();
		}
		catch (ClassNotFoundException e) {
			System.out.println("class info is wrong");
		}
		catch (ArithmeticException e) {
			System.out.println("class info is wrong");
		}
		catch (Exception e) {
			System.out.println("class info is wrong");
		}
		
		System.out.println("bye");
	}
	
}
