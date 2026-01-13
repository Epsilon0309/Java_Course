package NonStatic;

public class NonStaticExample {

	{
		System.out.println("Hello");
	}
	
	{
		System.out.println("Baccho");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		NonStaticExample a = new NonStaticExample(); // after creating the object the non-static block will be executed
		System.out.println("Main Middle");
		NonStaticExample b = new NonStaticExample(); // after creating the object the non-static block will be executed
		System.out.println("Main End");
		
	}
	
}
