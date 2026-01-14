package Inheritance;

public class Apple extends Fruit {

	float price;

	Apple(String color, String name, float price) {
		this.color = color;
		this.name = name;
		this.price = price;

	}

	public static void main(String[] args) {
		Apple a = new Apple("red", "Kashmir", 125);
		System.out.println(a.color);
		System.out.println(a.name);
		System.out.println(a.price);
		
		Fruit f= new Fruit("Green","Indian");
		System.out.println(f.color);
		System.out.println(f.name);
		//System.out.println(f.price);// we can't fetch it as it is child class variable

	}
}
