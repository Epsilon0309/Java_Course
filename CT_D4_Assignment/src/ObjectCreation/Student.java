package ObjectCreation;

public class Student {

	int id;
	String name;
	
	public void study() {
		System.out.println("Studying");
	}
	
	public static void main(String[] args) {
		Student s= new Student();
		System.out.println(s.id);
		System.out.println(s.name);
		
		s.id=101;
		s.name="Animesh";
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		s.study();
	}
	
}
