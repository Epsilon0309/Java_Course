package Abstraction;

public class CalCiChild1 extends Calculator{

	@Override
	public int add(int a,int b) {
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public void m1() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Calculator c = new CalCiChild1();
		System.out.println(	c.sub(25, 13));
		// if we call the methods it will act as the overridden method off the child class  
		System.out.println(	c.add(25, 13));
		System.out.println(	c.multiply(25, 13));
		
		//c.m1(); error
		
	}
	
}
