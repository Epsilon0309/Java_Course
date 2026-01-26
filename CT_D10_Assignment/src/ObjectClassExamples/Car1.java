package ObjectClassExamples;

import java.util.Objects;

public class Car1 {
	
	String modelName;
	double price;
	String color;
	int milage;
	
	public Car1() {
		
	}
	
	public Car1(String modelName,double price,String color,int milage) {
		this.modelName=modelName;
		this.price=price;
		this.color=color;
		this.milage=milage;
	}
	
	@Override
	public String toString() {
		return "Moddel: "+modelName+" Price: "+price+" Color: "+color+" Milage: "+milage;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(modelName,price,color,milage);
	}
	
	public int hashCode(Car1 p) {
		return this.modelName==p.modelName && this.price==p.price && this.color==p.color && this.milage==p.milage ?1:0;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		else if(o==null || this.getClass()!=o.getClass()) {
			return false;
		}
		
		Car1 p = (Car1)o;
		if(this.modelName==p.modelName && this.price==p.price && this.color==p.color && this.milage==p.milage) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Car1 c1 = new Car1("A8",250000000.00,"Black",10);
		Car1 c2 = new Car1("A8",250000001.00,"Black",10);
		Car1 c3 = new Car1();
		Car1 c4 = new Car1();
		
		
		System.out.println(c1.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c1.hashCode(c2));
		
		System.out.println(c3.equals(c2));
		
		
		
	
	}

}
