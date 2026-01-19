package Abstraction;

public class Circle extends Shape{

	@Override
	public int area(int a,int b) {
		System.out.print("Circle area: ");
		return (3*a*b);
	}
	
	public void add(int a,int b) {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		
		Circle c= new Circle();
		c.display(5,5);
		c.add(1);
	}
	
}
