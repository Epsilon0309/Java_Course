package Hashmap;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SampleHashing {

	public static void main(String[] args) {
		HashSet<Employee>emp = new HashSet<Employee>();
		
		emp.add(new Employee(10,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));//O(1)
		emp.add(new Employee(11,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp.add(new Employee(12,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp.add(new Employee(13,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp.add(new Employee(14,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp.add(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp.add(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		
		
		//System.out.println(Objects.hash(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l)));
		//System.out.println(Objects.hash(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l)));
//		
//		System.out.println(emp);// does not follow the order of insertion
//		
//		System.out.println("===================================");
//		
//		Iterator<Employee>a=emp.iterator();
//		
//		while(a.hasNext()) {
//			System.out.println(a.next());
//
//		}
		
		System.out.println("===================================");
		
		for(Employee e:emp) {
			System.out.println(e);
			
		}
		
		
		TreeSet<Employee>emp1 = new TreeSet<Employee>();
		
		emp1.add(new Employee(10,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));//O(logN)
		emp1.add(new Employee(11,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp1.add(new Employee(12,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp1.add(new Employee(13,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp1.add(new Employee(14,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp1.add(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),10,"sahil@gmail.com",987654321l));
		emp1.add(new Employee(15,"sahil","male",LocalDate.of(2003, 10, 10),11,"sahil@gmail.com",987654321l));
		
		System.out.println("===================================");
		
		for(Employee e:emp1) {
			System.out.println(e);
			
		}
		
		Set<Integer>s= new HashSet<Integer>();
		s.add(1);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		
		System.out.println(s);
		
		
	}
	
}
