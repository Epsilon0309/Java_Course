package ObjectClass;

import java.util.Objects;

public class Person {

	String name;
	int age;
	String location;
	
	public Person(	String name,int age,String location) {
		this.name=name;
		this.age=age;
		this.location=location;
	}
	
	@Override
	public String toString() {
		return " name: "+name+" age: "+age+" location: "+location;
	}
	
	@Override
	public int hashCode() {
		//java.util.Objects is utility class
		return Objects.hash(name,age,location);
	}
	
	public int hashCode(Person p) {
		return this.name==p.name && this.age==p.age && this.location==p.location ?1:0;
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
		
		Person p = (Person)o;
		if( this.name==p.name && this.age==p.age && this.location==p.location) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Person p = new Person("Sahil",22,"barnpur");
		
		
	}
	
	
}
