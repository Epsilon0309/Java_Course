package HasA;

public class CarEngineDriver {
	public static void main(String[] args) {
		
		Engine e = new Engine(2500,"Petrol");
		Car c = new Car(123,"Black","BMW",e);
		
		System.out.println("----------CAR------------");
		System.out.println(c.getId());
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		
		Engine e2 = c.getEngine();
		System.out.println("----------ENGINE------------");
		System.out.println(e2.getCC());
		System.out.println(e2.getFuelType());
		
	}
	
}
