package AccessModifier;

public class Private {
	
	private static String a="Private var";
	
	private static void m1() {
		System.out.println("Private method");
	}
	
	private Private() {
		System.out.println("Private Constructor");
	}
	
	public static void main(String[] args) {
		//private int b=20;// error
		System.out.println(a);
		m1();
		Private p= new Private();
	}

}
