package ArrayQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {

//	public static List<Employee> getSortedEmployees(Employee[] employees) {
////        Arrays.sort(employees, 
//////          (e1, e2) -> {
//////                int dateComparison = e1.getDate().compareTo(e2.getDate());
//////                if (dateComparison != 0) {
//////                    return dateComparison;
//////                }
//////                return e1.getTimeOfBirth().compareTo(e2.getTimeOfBirth());
//////            });
//		// Arrays.sort(employees,(a,b)->a.getDateOfBirth().compareTo(b.getDateOfBirth()));
//		// Arrays.sort(employees,(a,b)->a.getTimeOfBirth().compareTo(b.getTimeOfBirth()));
//		Arrays.sort(employees, (a, b) -> LocalDateTime.of(a.getDate(), a.getTimeOfBirth())
//				.compareTo(LocalDateTime.of(b.getDate(), b.getTimeOfBirth())));
////        );
//		return new ArrayList<>(Arrays.asList(employees));
//	}
	
    public static List<Employee> getSortedEmployee(Employee[] employees){
    	 
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(employees));
 
        Comparator<Employee> dateOfBirth=(e1, e2) -> e1.getDate().compareTo(e2.getDate());
        Comparator<Employee> timeOfBirth=(e1, e2) -> e1.getTimeOfBirth().compareTo(e2.getTimeOfBirth());
 
        Collections.sort(employeeList,dateOfBirth.thenComparing(timeOfBirth).thenComparing((o1, o2) -> o1.getExperience()-o2.getExperience()));
 
        return employeeList;
 
    }

	public static void main(String[] args) {

		Employee[] employees = {
				new Employee(101, "Alice Johnson", "alice.j@company.com", 5, LocalDate.of(2023, 3, 15),
						LocalTime.of(8, 30), 75000L),
				new Employee(102, "Bob Smith", "bob.smith@provider.net", 12, LocalDate.of(2018, 11, 2),
						LocalTime.of(14, 15), 120000L),
				new Employee(103, "Charlie Davis", "charlie.d@startup.io", 2, LocalDate.of(2025, 1, 10),
						LocalTime.of(0, 45), 55000L),
				new Employee(104, "Diana Prince", "diana.p@agency.org", 8, LocalDate.of(2021, 6, 20),
						LocalTime.of(19, 0), 95000L),
				new Employee(105, "Ethan Hunt", "e.hunt@mission.com", 15, LocalDate.of(2015, 5, 12),
						LocalTime.of(6, 10), 150000L),
				new Employee(106, "Fiona Gallagher", "fiona.g@outlook.com", 4, LocalDate.of(2022, 11, 11),
						LocalTime.of(11, 20), 68000L),
				new Employee(107, "George Miller", "g.miller@techcorp.com", 20, LocalDate.of(2010, 1, 5),
						LocalTime.of(5, 15), 185000L),
				new Employee(108, "Hannah Abbott", "hannah.a@edu.org", 3, LocalDate.of(2024, 2, 14),
						LocalTime.of(9, 45), 62000L),
				new Employee(109, "Ian Wright", "wright.i@sports.com", 7, LocalDate.of(2020, 12, 1),
						LocalTime.of(22, 10), 89000L),
				new Employee(110, "Julia Roberts", "julia.r@cinema.com", 10, LocalDate.of(2019, 4, 25),
						LocalTime.of(13, 0), 115000L),
				new Employee(111, "Kevin Hart", "k.hart@laugh.net", 6, LocalDate.of(2022, 11, 11), LocalTime.of(16, 20),
						82000L),
				new Employee(112, "Laura Palmer", "laura.p@peaks.com", 1, LocalDate.of(2025, 5, 20),
						LocalTime.of(3, 30), 48000L),
				new Employee(113, "Michael Scott", "m.scott@dundermifflin.com", 18, LocalDate.of(2012, 3, 18),
						LocalTime.of(8, 0), 92000L),
				new Employee(114, "Nina Simone", "n.simone@jazz.org", 9, LocalDate.of(2021, 7, 7), LocalTime.of(21, 15),
						105000L),
				new Employee(115, "Oscar Isaac", "oscar.i@space.com", 5, LocalDate.of(2023, 10, 10),
						LocalTime.of(10, 10), 77000L),
				new Employee(116, "Peter Parker", "p.parker@dailybugle.com", 2, LocalDate.of(2024, 9, 2),
						LocalTime.of(17, 45), 52000L),
				new Employee(117, "Quinn Fabray", "q.fabray@glee.edu", 4, LocalDate.of(2022, 11, 11),
						LocalTime.of(7, 30), 71000L),
				new Employee(118, "Riley Reid", "r.reid@freelance.com", 6, LocalDate.of(2023, 10, 10),
						LocalTime.of(12, 0), 88000L),
				new Employee(119, "Steven Strange", "s.strange@sanctum.org", 14, LocalDate.of(2016, 11, 4),
						LocalTime.of(23, 59), 200000L),
				new Employee(120, "Tina Fey", "t.fey@snl.com", 11, LocalDate.of(2018, 9, 28), LocalTime.of(15, 40),
						130000L) };

		List<Employee> list = new ArrayList<>(Arrays.asList(employees));

		list.add(new Employee());

		List<Employee> sortedEmployee = getSortedEmployee(employees);
		for (Employee employee : sortedEmployee) {
			System.out.println(employee);
		}


	}

}
