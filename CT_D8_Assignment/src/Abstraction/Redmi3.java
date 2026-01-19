package Abstraction;

public class Redmi3 extends Redmi2{

	@Override
	public void smartCamera() {
		System.out.println("Smart camera added");
	}
	
	public static void main(String[] args) {
		
		Redmi3 r3 = new Redmi3();
		r3.camera();
		r3.battery();
		r3.smartCamera();
		
		Redmi2 r2 = new Redmi3();
		r2.camera();
		r2.battery();
		r2.smartCamera();
		
		Redmi1 r1 = new Redmi3();
		r1.camera();
		r1.battery();
		//r1.smartCamera(); error
		
		Mobile m1 = new Redmi3();
		m1.camera();
		m1.battery();
	}
	
}
