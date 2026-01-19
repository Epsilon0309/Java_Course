package Interface;

public class TestDriver implements Test {
	
	public void m2() {
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		TestDriver t = new TestDriver();
		// t.m1(); private method
		t.m2();
		Test.m3();
		System.out.println(Test.a);
	}
}
