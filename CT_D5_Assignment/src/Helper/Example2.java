package Helper;

public class Example2 {
	
	int  a1;
	static int a2;
	Laptop l1;
	static Laptop l2;
	
	public Example2() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(this.l1);
	}
	
	public void m1() {
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(this.a1);// as non static
		System.out.println(l1);
		System.out.println(l2);
		
	}
	
	public static void m2() {
		Example2 e= new Example2();
		System.out.println(e.a1);// as non static so we have to create object
		System.out.println(a2);
		System.out.println(e.l1);
		System.out.println(l2);
	}

	public static void main(String[] args) {
		Example2 b1 = new Example2();
		b1.m1();
		m2();
		Example b2=null;
		Example b3;
	}
}
