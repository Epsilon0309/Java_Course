package Constructor;

public class Student {

	int id;
	String name;
	
	public Student() {
		System.out.println("Constructor");
	}
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.display();
		Student s2=new Student(123,"Sahil Sombit");
		s2.display();
	}

	
}
