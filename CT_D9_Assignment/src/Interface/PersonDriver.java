package Interface;

public class PersonDriver {
	public static void main(String[] args) {
//		Person p=new Person();
//		
//		p.setV(new Bike());
//		
//		p.getV().type();
//		p.getV().price();
//		
//		p.setV(new Car());
//		
//		p.getV().type();
//		p.getV().price();
		
		
		// using the help vehicle we are hiding the implementation details of the vehicle object 
		Vehicle v = HelpVehicle.getVehicle();
		v.price();
		v.type();
		
	}
}
