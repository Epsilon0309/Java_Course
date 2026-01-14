package Understanding;


public class Laptop {

	String brand;
	double price;
	
	public Laptop() {
		
	}
	
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
		Laptop l1 = HelpLaptop.getLaptop();
		
		Laptop l2 = new Laptop("Hp",65000);
		l2.compareLaptop(l1);
		
		Laptop l3=HelpLaptop.getLaptopWithData("Asus", 50000);
		System.out.println(l3.brand);
		
		Laptop l4 = HelpLaptop.verifyPrice("hero", 4500);
	}
	
}
