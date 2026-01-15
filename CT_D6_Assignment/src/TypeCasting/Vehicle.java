package TypeCasting;

public class Vehicle {

	public void travel() {
		System.out.println("We can travel through it");
	}
	
	public static void main(String[] args) {
		
		// Bike
		Vehicle v = new Bike();//UC
		// as up casted we can only use vehicle class method
		v.travel();
		
		Bike b = (Bike)v;// DC
		b.travel();
		b.topSpeed();
		
		v= new Car();//UC
		v.travel();
		
		Car c = (Car)v;// DC
		c.travel();
		c.noOfPassenger();
		
		v= new Train();//UC
		v.travel();
		
		Train t = (Train)v;// DC
		t.travel();
		t.ticketPrice();
		
		
		//class cast exception
		
		v= new Car();//UC
		Bike b2 = (Bike)v;
		
	}
	
}

class Bike extends Vehicle{
	
	public void topSpeed() {
		System.out.println("It's top speed is 150km/h");
	}
	
}
class Car extends Vehicle{
	
	public void noOfPassenger() {
		System.out.println("7 people can travel through it");
	}
}
class Train extends Vehicle{
	
	public void ticketPrice() {
		System.out.println("Ticket price of it is 50rs");
	}
}