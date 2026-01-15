package SupreCallStatement;

public class Mobile extends Product {

	double price;
	boolean sim;
	
	public Mobile(String brand,double price,boolean sim) {
		super(brand);
		this.price=price;
		this.sim=sim;
	}
	
	public void printer() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(sim);
	}
	
}
