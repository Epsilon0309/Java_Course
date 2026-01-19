package Abstraction;

public abstract class Shape {
	
	public abstract int area(int a,int b);
	
	public void add(int a) {
		System.out.println("Parent");
	}
	
	public void display(int a,int b) {
		System.out.println(area(a,b));
	}

}
