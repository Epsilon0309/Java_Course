package NonStatic;

public class Example2 {

	{
		System.out.println("NS1");
	}
	
	static {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Example2 e = new Example2();
		Example2 f = new Example2();
		Example2 g = new Example2();
	}
	
	static {
		System.out.println("Baccho");
	}
	
}
