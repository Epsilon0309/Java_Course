package SupreCallStatement;

public class Laptop extends Product {

	double price;
	String processor;
	
	public Laptop(String brand,double price,String processor) {
		super(brand);
		this.price=price;
		this.processor=processor;
	}
	
	public void print() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(processor);
	}
	
}
