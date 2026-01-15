package SupreCallStatement;

public class Employee  extends Human{

	int id;
	double salary;
	
	public Employee(String name,int age,char gender,int id,double salary) {
		super(name,age,gender);
		this.id=id;
		this.gender=gender;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.id);
		System.out.println(this.salary);
		
	}
	
}
