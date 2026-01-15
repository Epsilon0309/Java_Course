package SupreCallStatement;

public class Student extends Human{

	float percent;
	
	public Student(String name,int age,char gender,float precent) {
		super(name,age,gender);
		this.percent=precent;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.percent);
		
	}
	
}
