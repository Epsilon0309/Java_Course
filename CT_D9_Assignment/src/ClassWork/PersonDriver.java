package ClassWork;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setB(new SBI());p1.setV(new Car());
		p1.getB().bankName();
		p1.getB().hasAccount();
		p1.getV().price();
		p1.getV().type();
		
		Bike b= new Bike();
		
		p1.setB(new HDFC());
		p1.getB().bankName();
		p1.getB().hasAccount();
		p1.setV(b);
		p1.getV().price();
		
		p1.setB(new PNB());
		p1.getB().bankName();
		p1.getB().hasAccount();
	}
}
