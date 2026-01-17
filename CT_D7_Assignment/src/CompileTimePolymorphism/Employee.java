package CompileTimePolymorphism;

public class Employee {
	
	int id;
	String name;
	double salary;
	String dept;
	
	public Employee(int id) {
		this.id=id;
	}
	public Employee(int id,String name) {
		this(id);
		this.name=name;
	}
	public Employee(int id,String name,double sal) {
		this(id,name);
		this.salary=sal;
	}
	public Employee(int id,String name,double sal,String dept) {
		this(id,name,sal);
		this.dept=dept;
	}
	
	public void print() {
		System.out.print(id+" ");
		System.out.print(name+" ");
		System.out.print(salary+" ");
		System.out.print(dept);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee(123,"Sahil",236541.236d,"App dev");
		Employee e2= new Employee(124,"Sombit",236541.236d);
		Employee e3= new Employee(125,"Animesh");
		Employee e4= new Employee(126);
		
		e1.print();
		e2.print();
		e3.print();
		e4.print();
	}
	
	

}
