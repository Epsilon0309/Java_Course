package TypeCasting;

public class Helper {

	public static void getVehicle(Vehicle v) {
		if(v instanceof Car) {
			Car c= (Car)v;
			c.noOfPassenger();
		}
		else if(v instanceof Bike) {
			Bike b = (Bike)v;
			b.topSpeed();
		}
		else {
			Train t = (Train)v;
			t.ticketPrice();
		}

	}
	
	public static void main(String[] args) {
		Car c= new Car();
		System.out.println(c instanceof Vehicle);
		Bike b= new Bike();
		getVehicle(b);
	}
	
}
