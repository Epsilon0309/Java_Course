package ObjectClass;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public int hashCode() {
		//java.util.Objects is utility class
		return Objects.hash(id,name);
	}
	
	public int hashCode(Student s) {
		return this.id==s.id && this.name==s.name?1:0;
	}
	
	@Override
	public boolean equals(Object o) {
		//address check
		if(this==o) {
			return true;
		}
		
		if(o==null || o.getClass()!=this.getClass()) {
			return false;
		}
		
		Student s = (Student)o;
		if( this.id==s.id && this.name==s.name) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student(10,"XYZ");
		Student s2 = new Student(11,"XYZ");
		Student s3 = new Student(10,"XYZ");
		
		Employee e = new Employee(12,"as",123,"as");
		
		Object o = new Student(10,"XYZ");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1.hashCode(s3));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.equals(e));// why this is happening
		//System.out.println(e.equals(s2));// why this is happening
		
		System.out.println();

	}

}
