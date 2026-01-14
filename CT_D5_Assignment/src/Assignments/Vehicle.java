package Assignments;

public class Vehicle {

	String color;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String color) {
		this.color=color;
	}
	
	public static void main(String[] args) {
		
		// Vehicle class
		Vehicle v1= new Vehicle("Black");
		Vehicle v2= new Vehicle("Red");
		Vehicle v3= new Vehicle("White");
		
		System.out.println(v1.color);
		System.out.println(v2.color);
		System.out.println(v3.color);
		
		//Bike class
		Bike b1= new Bike("Red","TVS",125000);
		Bike b2= new Bike("Blue","Bajaj",150000);
		Bike b3= new Bike("Green","Yamaha",250000);
		
		b1.display();
		b2.display();
		b3.display();
		
		//Car class
		Car c1= new Car("Black","Audi",12500000);
		Car c2= new Car("White","BMW",15000000);
		Car c3= new Car("Blue","Lamborgini",25000000);
		
		c1.display();
		c2.display();
		c3.display();
		
	}
	
}

class Bike extends Vehicle{
	String brand;
	double price;
	
	public Bike(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public void display() {
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		
	}
}

class Car extends Vehicle{
	String brand;
	double price;
	
	public Car(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public void display() {
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.price);
		
	}
}
