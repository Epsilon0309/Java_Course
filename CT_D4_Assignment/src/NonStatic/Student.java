package NonStatic;

public class Student {
	
	int id;
	String name;
	public void initialize(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
	public void m1() {
		int id=200;
		System.out.println(id);
		System.out.println(this.id);
	}
	
	public static void main(String[] args) {
		Student s= new Student();
//		s.m1();
		s.display();
		s.initialize(12,"Sahil");
		s.display();
		
	}

}
