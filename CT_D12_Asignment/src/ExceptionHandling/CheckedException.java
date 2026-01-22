package ExceptionHandling;

public class CheckedException {
	
	public static void main(String[] args) {
		System.out.println("hii");
		
		try {
			Class.forName("ExceptionHandling.excptionHandling");
		} catch (ClassNotFoundException e) {
			System.out.println("Class info is wrong");
		}
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			System.out.println("Checked exception cause");
		}
		
		System.out.println("bye");
	}

}
