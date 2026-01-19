package ClassWork;

public class EmployeeServiceImp implements EmployeeService{

	@Override
	public Employee[] getHighSalaryEmployees(Employee[]employees,double minSalary) {
		
		Employee[]ans1= new Employee[employees.length];
		int count=0;
		for(Employee e:employees) {
			if(e.salary>minSalary) {
				ans1[count]=e;
				count++;
			}
		}
		
		Employee []ans= new Employee[count];
		for(int i=0;i<count;i++) {
			ans[i]=ans1[i];
		}
		
		return ans;
		
	}

	@Override
	public double calculateAverageSalary(Employee[] employees) {
		double sum=0d;int count=0;
		for(Employee e:employees) {
			count++;
			sum+=e.salary;
		}
		
		double avgSal=  sum/count;

		return avgSal;
	}

	@Override
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee ans = new Employee();
		double maxSal=0d;
		for(Employee e:employees) {
			if(maxSal<e.salary) {
				maxSal=e.salary;
			}
		}
		
		for(Employee e:employees) {
			if(maxSal==e.salary) {
				ans=e;
			}
		}

		return ans;
	}
	
}
