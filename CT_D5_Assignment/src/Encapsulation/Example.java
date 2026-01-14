package Encapsulation;

public class Example {
//	
//	static Laptop l1; // static
//	Laptop l2; // non-static
	
	public static void main(String[] args) {
//		System.out.println(l1);
//		Example e= new Example();
//		System.out.println(e);
//		System.out.println(e.l2);
//		e.l2=new Laptop();
//		System.out.println(e.l2);
		
		Student s= new Student();
		s.name="Raju";
		s.setPass(123);
		System.out.println(s.name);
		System.out.println(s.getPass());
		
		
		
		
	}
	
	
}
