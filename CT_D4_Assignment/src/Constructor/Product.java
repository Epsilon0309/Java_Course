package Constructor;

public class Product {
	int id;
	String name;
	double price;
	
	Product(int id){
		this.id=id;
	}
	Product(int id, String name){
		this(id);
		this.name=name;
	}
	Product(int id,String name,double price){
		this(id,name);
		this.price=price;
	}
	
	public void display() {
		System.out.println("Displaying details: ");
		System.out.print("Id:"+id);
		System.out.print(" Name:"+name);
		System.out.println(" Price:"+price);
		System.out.println("------------------------");
	}
	
	public static void main(String[] args) {
		Product p = new Product(10,"Pen",20.0);
		p.display();
		Product q = new Product(11,"Pen");
		q.display();
		Product r = new Product(12);
		r.display();
	}
	
}
