package ClassWork;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void print(Employee[]e) {

		for(Employee a:e) {
			System.out.println();
			System.out.print("id: "+a.id+" ");
			System.out.print("name: "+a.name+" ");
			System.out.print("salary: "+a.salary+" ");
		}
	}
	
	public static void main(String[] args) {
		// as this 
		EmployeeServiceImp esi = new EmployeeServiceImp() ;
		Employee []e=new Employee[5];
		e[0]= new Employee(1,"Sahil1",12345);
		e[1]= new Employee(2,"Sahil2",123456);
		e[2]= new Employee(3,"Sahil3",162345);
		e[3]= new Employee(4,"Sahil4",172345);
		e[4]= new Employee(5,"Sahil5",123458);
		
		Employee[]ans=esi.getHighSalaryEmployees(e,123457d);
		print(ans);
	}
	
}
