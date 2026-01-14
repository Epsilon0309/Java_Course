package Assignments;

public class PersonClass {


	String name;
	int age;
	
	public PersonClass() {
		
	}
	
	public PersonClass(String name, int age) {
		this.name =name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Alex",23);
		Teacher t1 = new Teacher("Chris",28,80000);
		StudentClass s1 = new StudentClass("Adam",22,110);
		GradStudentClass g1 = new GradStudentClass("Tony", 25,101,"Quantum Physics");
		
		System.out.println(" "+p1.age+p1.name);
		System.out.println(" "+t1.age+t1.name+t1.salary);
		System.out.println(" "+s1.age+s1.name+s1.rollNo);
		System.out.println(" "+g1.age+g1.name+g1.rollNo+g1.researchArea);
		
	}
	
}

class Teacher extends PersonClass{
	
	double salary;

	public Teacher(String name, int age,double salary) {
		this.name =name;
		this.age=age;
		this.salary=salary;
	}
	
}

class StudentClass extends PersonClass{
	
	int rollNo;
	
	public StudentClass() {
		
	}
	
	public StudentClass(String name, int age,int roll) {
		this.name =name;
		this.age=age;
		this.rollNo=roll;
	}
	
}

class GradStudentClass extends StudentClass{
	
	String researchArea;
	
	public GradStudentClass(String name, int age,int roll, String researchArea) {
		this.name =name;
		this.age=age;
		this.rollNo=roll;
		this.researchArea=researchArea;
	}
	
}
