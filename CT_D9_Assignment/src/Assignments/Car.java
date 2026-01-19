package Assignments;

public class Car {

	private Engine engine;// strong relation 
	private Sunroof sunroof;// weak relation 
	
	public Car(){
		engine = new Engine();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Sunroof getSunroof() {
		return sunroof;
	}

	public void setSunroof(Sunroof sunroof) {
		this.sunroof = sunroof;
	}
	
	public static void main(String[] args) {
		Car car = new Car(); // by default the engine object is created
		car.engine.power();
		
		car.setSunroof(new Sunroof()); // externally we have to create the object
		car.sunroof.sunroof();
	}
	
}

class Engine{
	public void power() {
		System.out.println("Powerful engine");
	}
	
}

class Sunroof{
	public void sunroof() {
		System.out.println("Sunroof");
	}
	
}
