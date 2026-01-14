package Assignments;
// multilevel inheritance
public class Person {

	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name =name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Alex",23);
		Student s1 = new Student("Adam",22,110);
		GradStudent g1 = new GradStudent("Tony", 25,101,"Quantum Physics");
		
		System.out.println(" "+p1.age+p1.name);
		System.out.println(" "+s1.age+s1.name+s1.rollNo);
		System.out.println(" "+g1.age+g1.name+g1.rollNo+g1.researchArea);
		
	}
	
}

class Student extends Person{
	
	int rollNo;
	
	public Student() {
		
	}
	
	public Student(String name, int age,int roll) {
		this.name =name;
		this.age=age;
		this.rollNo=roll;
	}
	
}

class GradStudent extends Student{
	
	String researchArea;
	
	public GradStudent(String name, int age,int roll, String researchArea) {
		this.name =name;
		this.age=age;
		this.rollNo=roll;
		this.researchArea=researchArea;
	}
	
}
