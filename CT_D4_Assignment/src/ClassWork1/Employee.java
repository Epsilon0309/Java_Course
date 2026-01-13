package ClassWork1;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name+" is working");
	}
	
	public void initialize(int id, String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public void printEmployee() {
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		work();
	}
	
	public static void main(String[] args) {
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter no of employees: ");
//		int num = sc.nextInt();
//		
//		while(num>0) {
//			Employee e= new Employee();
//			System.out.println("Enter employee id: ");
//			e.id = sc.nextInt();
//			System.out.println("Enter employee name: ");
//			sc.nextLine();
//			e.name=sc.nextLine();
//			System.out.println("Enter employee salary: ");
//			e.salary=sc.nextDouble();
//			e.printEmployee();
//			System.out.println();
//			num--;
//		}
//		
		Employee e1= new Employee();
		e1.initialize(12,"SAHIL", 236210);
		e1.printEmployee();
	}
}
