package Exam24thJan;

public class Employee {

	String employeeId;
	String name;
	String role;
	private double salary;
	
	public void setSalary(String role,double salary) throws InvalidSalaryException,UnauthorizedAccessException{
		if(salary<1000) {
			throw new InvalidSalaryException("invalid salary");
		}
		if(role=="HR") {
			this.salary=salary;
		}
		else {
			throw new UnauthorizedAccessException("Can't access these fields");
		}
	}
	
	public double getSalary() {

		return salary;
	}
	
	
	public static void main(String[] args) {
		FullTimeEmployee e1 = new FullTimeEmployee();
		e1.employeeId="12365";
		e1.name="Arnab";
		e1.role="sde";
		try {
			e1.setSalary("HR",12360);
		} catch (UnauthorizedAccessException e) {
			System.out.println("UnauthorizedAccessException handled");
		} catch (InvalidSalaryException e) {
			System.out.println("InvalidSalaryException handled");
		}
		
		System.out.println(e1.employeeId);
		System.out.println(e1.name);
		System.out.println(e1.role);
		System.out.println(e1.getSalary());
		
		e1.payroll(2);
		
		try {
			e1.setSalary("MANAGER",12360);
		} catch (UnauthorizedAccessException e) {
			System.out.println("UnauthorizedAccessException handled");
		} catch (InvalidSalaryException e) {
			System.out.println("InvalidSalaryException handled");
		}
		
		try {
			e1.setSalary("HR",-12360);
		} catch (UnauthorizedAccessException e) {
			System.out.println("UnauthorizedAccessException handled");
		} catch (InvalidSalaryException e) {
			System.out.println("InvalidSalaryException handled");
		}
	}
	
	
}

interface PayrollBehaviour{
	void payroll();
}

class FullTimeEmployee extends Employee implements PayrollBehaviour{

	@Override
	public void payroll() {
		System.out.println("Payroll for fill time employee");
	}
	
	public void payroll(int exp) {
		System.out.println("Payroll for fill time experineced employee");
	}
	
}

class ContractEmployee implements PayrollBehaviour{

	@Override
	public void payroll() {
		System.out.println("Payroll for contractual employee");
	}
	
	public void payroll(int exp) {
		System.out.println("Payroll for contractual experineced employee");
	}
	
}


class InvalidSalaryException extends Exception{
	
	public InvalidSalaryException(String msg) {
		super("invalid salary");
	}
}

class UnauthorizedAccessException extends RuntimeException{
	
	public UnauthorizedAccessException(String msg) {
		super("invalid salary");
	}
}