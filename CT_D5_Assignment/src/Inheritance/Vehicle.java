package Inheritance;

public class Vehicle {

	String brand;
	String color;
	double price;
	
	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Bike b =new Bike("BMW","Black",350000);
		Vehicle v = new Vehicle();
		v.brand="honda";
		v.color="red";
		v.price=100000;
		v.printVehicle();
		b.printVehicle();
	}
	
}

class Bike extends Vehicle{
	
	double price;
	
	Bike(String brand,String color,double price){
		this.brand=brand;
		this.color=color;
		this.price=100;
	}
	public void printVehicle() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
	}
}