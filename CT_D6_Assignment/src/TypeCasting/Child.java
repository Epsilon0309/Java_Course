package TypeCasting;

public class Child extends Parent{

	public void m2() {
		System.out.println("Child Method");
	}
	
	public static void main(String[] args) {
		Child c= new Child();
		Parent p = c; //UC
		p.m1();
		//p.m2();//CTE

		Child c2 = (Child)p; //DC
		c2.m1();
		c2.m2();
		
	}
	
}
