package Static;

public class Example3 {
	public static void e3() {
		
		System.out.println(Example2.name); // access the static variable of different class
	}
	

	public static void main(String[] args) {
		e3();
		Example2.e2();
	}

}
