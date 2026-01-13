package Static;

public class StaticExample {
	static {
		System.out.println("SB1");
	}

	static {
		System.out.println("SB2");
		m1();
	}
	
	public static void m1() {
		System.out.println("M1");
	}

	public static void main(String[] args) {
		System.out.println("Main");
	}

	// All the static block will be executed prior to the main block
	static {
		System.out.println("SB3");
	}

}
