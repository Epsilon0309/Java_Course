package SupreCallStatement;

public class Human {

	String name;
	int age;
	char gender;
	
	public Human(String name,int age,char gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
	}
	
	public static void main(String[] args) {
		Human h= new Human("Alex",21,'m');
		Employee e= new Employee("Alex",21,'m',123,112233.33);
	}
}
