package Static;

public class Example2 {
	
	static int a =10;// static variable
	static String name="Raju";
	
	public static void e2() {
		int a=20; // local variable
		System.out.println(a); // access the local variable
		System.out.println(Example2.a); // access the static variable
	}
	

	public static void main(String[] args) {
		e2();
	}
}
