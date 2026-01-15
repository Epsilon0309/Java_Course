package SupreCallStatement;

public class Product {
 
	String brand;
	
	public Product(String brand) {
		this.brand=brand;
	}
	
	public static void main(String[] args) {
		Laptop l = new Laptop("ASUS",180000,"i9 Ultra");
		l.print();
	}
	
}
