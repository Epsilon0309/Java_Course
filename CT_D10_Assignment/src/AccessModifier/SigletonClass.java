package AccessModifier;

public class SigletonClass {
	
	private static SigletonClass singleton;
	
	private SigletonClass() {
		System.out.println("Object");
	}

	private static SigletonClass getSingletonClass() {
		if(singleton!=null) {
			return singleton;
		}
		return new SigletonClass();
	}

	protected void display() {
		System.out.println(singleton);
	}
	
	public static void main(String[] args) {
		SigletonClass sc =getSingletonClass();
		//sc.display();
		SigletonClass sc1 = getSingletonClass();
		//sc1.display();
		
	}
	
}
