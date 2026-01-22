package ExceptionHandling;

public class AgeExecption extends RuntimeException{

	public AgeExecption(String msg) {
		super(msg);
	}
	
	public static void ageCheck(int age) {
		if(age>0) {
			System.out.println("age is valid");
		}
		else {
			throw new AgeExecption(age+" is invalid");
		}
	}
	
	public static void main(String[] args) {
		int age1 =10;
		ageCheck(age1);
		try {
			int age2 =-10;		
			ageCheck(age2);
		}
		catch (AgeExecption e) {
			System.out.println("AgeException handled");
		}
		
	}
	
}
