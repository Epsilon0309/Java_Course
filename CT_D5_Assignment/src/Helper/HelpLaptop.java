package Helper;

public class HelpLaptop {

	public static Laptop getLaptop() {
		return new Laptop();
	}
	
	public static Laptop getLaptopWithData(String brand,double price) {
		return new Laptop(brand,price);
	}
	
	public static Laptop verifyPrice(String brand,double price) {
		if(price>=10000 && price<=500000) {
			return new Laptop(brand,price);
		}
		else {
			System.out.println("Laptop can't be created");
			return null;
		}
	}
	
}

