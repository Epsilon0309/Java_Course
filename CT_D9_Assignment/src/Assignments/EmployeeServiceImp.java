package Assignments;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {
		Employee[] ans1 = new Employee[employees.length];
		int count = 0;
		for (Employee e : employees) {
			if (e.sal > minSalary) {
				ans1[count] = e;
				count++;
			}
		}
		Employee[] ans = new Employee[count];
		for (int i = 0; i < count; i++) {
			ans[i] = ans1[i];
		}

		return ans;
	}

	@Override
	public double calculateAverageSalary(Employee[] employees) {
		double sum = 0;
		int count = 0;
		for (Employee e : employees) {
			sum += e.sal;
			count++;
		}
		double avg = sum / count;
		return avg;
	}

	@Override
	public Employee getTopPaidEmployee(Employee[] employees) {
		Employee ans = new Employee();
		double highest = 0;
		for (Employee e : employees) {
			if (highest < e.sal) {
				highest = e.sal;
			}
		}
		for (Employee e : employees) {
			if (highest == e.sal) {
				ans = e;
			}
		}

		return ans;
	}

	@Override
	public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {
		Employee[] ans1 = new Employee[employees.length];
		int count = 0;
		for (Employee e : employees) {
			if (e.experience > minYears) {
				ans1[count] = e;
				count++;
			}
		}
		Employee[] ans = new Employee[count];
		for (int i = 0; i < count; i++) {
			ans[i] = ans1[i];
		}

		return ans;
	}

	@Override
	public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {
		Employee ans = new Employee();
		double highest = 0;
		for (Employee e : employees) {
			if(e.department==department) {
				if (highest < e.sal) {
					highest = e.sal;
				}
			}

		}
		for (Employee e : employees) {
			if (highest == e.sal) {
				ans = e;
			}
		}

		return ans;
	}

	@Override
	public double getAverageSalaryByDeparment(Employee[] employees, String department) {
		double sum = 0;
		int count = 0;
		for (Employee e : employees) {
			if(e.department==department) {
				sum += e.sal;
				count++;
			}

		}
		double avg = sum / count;
		return avg;
	
	}

}
