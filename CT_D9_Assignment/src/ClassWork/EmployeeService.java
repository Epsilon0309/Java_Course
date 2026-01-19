package ClassWork;

public interface EmployeeService {
	
	Employee[] getHighSalaryEmployees(Employee[]employees,double minSalary);
	
	double calculateAverageSalary(Employee[] employees);
	
	Employee getTopPaidEmployee(Employee[] employees);

}
