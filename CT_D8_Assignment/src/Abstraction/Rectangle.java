package Abstraction;

public class Rectangle extends Shape{
	public int area(int a,int b) {
		System.out.print("Rectangle area: ");
		return (a*b);
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.display(2,3);
	}
}
