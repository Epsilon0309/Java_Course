package Assignments;

public class Employee {

	int id;
	String name;
	double sal;
	String department;
	int experience;
	
	public Employee() {
		
	}
	
	public Employee(int id,String name,double sal,String department,int experience) {
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.department=department;
		this.experience=experience;
	}
	
	public static void printEmployee(Employee a) {
		System.out.println();
		System.out.print("id: "+a.id+" ");
		System.out.print("name: "+a.name+" ");
		System.out.print("salary: "+a.sal+" ");
		System.out.print("salary: "+a.department+" ");
		System.out.print("salary: "+a.experience+" ");
	}
	
	public static void printEmployeeArray(Employee[]e) {

		for(Employee a:e) {
			System.out.println();
			System.out.print("id: "+a.id+" ");
			System.out.print("name: "+a.name+" ");
			System.out.print("salary: "+a.sal+" ");
			System.out.print("salary: "+a.department+" ");
			System.out.print("salary: "+a.experience+" ");
		}
	}
	
	public static void main(String[] args) {
		
		EmployeeServiceImp esi = new EmployeeServiceImp() ;
		
		Employee[]e=new Employee[5];
		e[0]= new Employee(1,"Sahil1",12345,"IT",1);
		e[1]= new Employee(2,"Sahil2",123456,"CSE",4);
		e[2]= new Employee(3,"Sahil3",162345,"IT",2);
		e[3]= new Employee(4,"Sahil4",172345,"CSE",7);
		e[4]= new Employee(5,"Sahil5",123458,"IT",5);
		
		
		printEmployeeArray(esi.getHighSalaryEmployees(e,123456));
		System.out.println();
		printEmployeeArray(esi.getExperiencedEmployees(e,2));
		System.out.println();
		printEmployee(esi.getTopPaidEmployeeByDepartment(e, "IT"));
		System.out.println();
		printEmployee(esi.getTopPaidEmployee(e));
		System.out.println();
		System.out.println(esi.calculateAverageSalary(e));
		System.out.println(esi.getAverageSalaryByDeparment(e,"CSE"));
		
	}
	
}
