package RunTimePolymorphism;

public class Child2 extends Parent2{

	public static void home2() {
		System.out.println("Child");
	}
	
	public static void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.home2();
		
		Child2 c = new Child2();
		c.home2();
		c.bike();
		
		Child2 c2= new Child2(); 
		
		Parent2 p2 = c2;
		p2.home2();
		
		
	}
}
