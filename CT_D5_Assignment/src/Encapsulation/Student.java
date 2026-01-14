package Encapsulation;

public class Student {

	String name;
	private int pass;
	
	// no arg constructor
	
	public Student() {
		
	}
	// Parameterized
	public Student(String name,int pass) {
		this.name=name;
		this.pass=pass;
	}
	
	
	
	public int getPass() {
		return pass;
	}
	
	public void setPass(int password) {
		pass=password;
		//this.pass=password; same
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		s.name="Raju";
		s.pass=123;
		System.out.println(s.name);
		System.out.println(s.pass);
	}
	
}
