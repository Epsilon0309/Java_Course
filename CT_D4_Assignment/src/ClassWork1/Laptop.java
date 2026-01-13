package ClassWork1;

public class Laptop {

	String brand;
	double price;
	
	public Laptop(String brand,double price) {
		this.brand=brand;
		this.price=price;
	}
	
	public void compareLaptop(Laptop l1) {
		if(this.price>l1.price) {
			System.out.println(this.brand+" is more costly");
		}
		else {
			System.out.println(l1.brand+" is more costly");
		}
	}
	
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell",60000);
		Laptop l2 = new Laptop("Hp",65000);
		l2.compareLaptop(l1);
	}
	
}
