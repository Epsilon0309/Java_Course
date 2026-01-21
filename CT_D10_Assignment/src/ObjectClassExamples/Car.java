package ObjectClassExamples;

public class Car {
	
	String modelName;
	double price;
	String color;
	int milage;
	
	public Car() {
		
	}
	
	public Car(String modelName,double price,String color,int milage) {
		this.modelName=modelName;
		this.price=price;
		this.color=color;
		this.milage=milage;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("A8",250000000.00,"Black",10);
		Car c3 = new Car();
		Car c4 = c2;
		Car c5 = new Car("A8",250000000.00,"Black",10);
		
		System.out.println(c1);// jvm internally calls the toString function and returns the location of the object created
		System.out.println(c1.toString());// same result as the previous
		System.out.println(c2);
		
		c1.color="blue";
		System.out.println(c1.toString());
		
		System.out.println(c1.hashCode());// it returns the integer hashed value of every parameter present for a particular object
		System.out.println(c3.hashCode());
		
		System.out.println(c1.equals(c4));// it compares the both object address present in the heap
		System.out.println(c4.equals(c2));// basically inside c4 the address of c2 is given so it is giving true as output
		System.out.println(c1.equals(c1));
		
		System.out.println(c1==c2);// does the same as equals
		System.out.println(c5.milage==c2.milage);
	}

}
