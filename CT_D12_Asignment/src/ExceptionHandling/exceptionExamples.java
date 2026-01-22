package ExceptionHandling;

public class exceptionExamples {
	

	public static void main(String[] args) {
		System.out.println("Hii");
		
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		
		String s ="abc";
		try {
			System.out.println(s.charAt(3));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Can't access the index out of bounds");
		}
		
		int []a= new int[5];
		try {
			System.out.println(a[5]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't access the index");
		}
		
		String s1 = null;
		try {
			System.out.println(s1.toLowerCase());
		}
		catch (NullPointerException e) {
			System.out.println("can't do to null");
		}
		
		
	}
	
}

class Hello extends exceptionExamples{
	
}
class Hello1 extends exceptionExamples{
	
}
