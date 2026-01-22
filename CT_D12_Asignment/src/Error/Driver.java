package Error;

public class Driver {
	
	public static void main(String[] args) {
		m2();
	}
	// stackoverflow error
	public static void m1() {
		System.out.println("hi");
		m1();
	}
	//outofmemory error
	public static void m2() {
		String s="xyz";
		while(true) {
			s=s+s;
		}
	}

}
