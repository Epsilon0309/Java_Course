package ClassWork1;

public class Product {

	int id;
	String name;
	float price;
	int rating;
	
	public Product(int id,String name,float d ,int i) {
		this.id=id;
		this.name=name;
		this.price=d;
		this.rating=i;
	}
	
	public Product(int id,String name,float price ) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	public Product(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Displaying details: ");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Rating: "+rating);
	}
	
	public static void main(String[] args) {
		Product a=new Product(1,"Animesh",200,4);
		a.display();
	}
	
}
