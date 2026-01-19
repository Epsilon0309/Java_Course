package Abstraction;

public abstract class Employee {

	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public Employee() {
		
	}
	public abstract void printEmployee();
	
	public static void main(String[] args) {
		Raju r= new Raju(10,"Raju",12345);
		r.printEmployee();
		
	}
	
}

class Raju extends Employee{
	double sal;
	
	public void printEmployee() {
		System.out.println(this.id); 
		System.out.println(this.name); 
		System.out.println(this.sal); 
		
	};
	
	public Raju(int id,String name,double sal) {
		super(id,name);
		this.sal=sal;
	}
}
