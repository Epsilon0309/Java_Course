package ObjectClass;

public class Employee {

	int id;
	String name;
	double sal;
	String department;
	
	public Employee(int id,String name,double sal,String dept) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.department=dept;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" name: "+name+" sal: "+sal+" dept: "+department;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(12,"xyz",123,"it");
		System.out.println(e);
		
		Employee[]e1 = new Employee[3];
		e1[0]=e;
		e1[1]=new Employee(12,"xyz",1234,"it");
		e1[2]=new Employee(12,"xyz",12345,"it");
		
		for(int i=0;i<3;i++) {
			System.out.println(e1[i]);
		}
		
	}
	
}
