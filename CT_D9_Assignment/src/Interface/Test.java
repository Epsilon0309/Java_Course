package Interface;

public interface Test {

	public static final int a=10;
	int b=20;
	
	private void m1() {
		System.out.println("Private method");
	}
	
	default void m2() {
		System.out.println("Default method");
		m1();
	}
	
	public static void m3() {
		System.out.println("static method");
	}
	
}
