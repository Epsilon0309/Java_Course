package SuperKeyword;

public class Child extends Parent{
	
	int a=20;
	
	public void m2() {
		System.out.println(a);
		System.out.println(super.a);
		super.m1();
		this.m1();
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.m2();
		
	}

}
