package Assignments;

public class Marker {

	String color;
	String brand;
	double price;
	
	public void draw() {
		System.out.println(color +" markers of "+brand+" is good.");
	}
	
	public void write() {
		System.out.println("It writes well");
	}
	
	//constructor to initialize
	public void initialize(String color,String brand,double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	public void display() {
		System.out.println("Color: "+color);
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		draw();
		write();
		System.out.println("------------");
	}
	
	public static void main(String[] args) {
		Marker m = new Marker();
		m.initialize("Black", "Luxor", 45.0);
		m.display();
		
		Marker o = new Marker();
		o.initialize("Blue", "Luxor", 50.0);
		o.display();
		
		Marker p = new Marker();
		p.initialize("Red", "Cello", 55.0);
		p.display();
		
		Marker q = new Marker();
		q.initialize("Green", "Link", 60.0);
		q.display();
		
		Marker r = new Marker();
		r.initialize("Orange", "Cursor", 45.0);
		r.display();
		
	}
	
}
