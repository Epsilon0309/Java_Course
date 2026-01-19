package Interface;

public interface Vehicle {

	void price();
	
	void type();
}

class Bike implements Vehicle{
	public void price() {
		System.out.println("263142");
	}
	public void type() {
		System.out.println("Petrol");
	}
}

class Car implements Vehicle{
	public void price() {
		System.out.println("2631429");
	}
	public void type() {
		System.out.println("EV");
	}
}
