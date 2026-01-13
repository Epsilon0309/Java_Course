package Static;

public class StaticBlock {
	
	static int a=20; // static variable

	static {
		System.out.println("SB1");
		int a=10; // local variable
		System.out.println(a);
		System.out.println(StaticBlock.a);
	}

	static {
		System.out.println("SB2");
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
