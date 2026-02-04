package Sorting;

import java.time.LocalDate;
import java.util.Arrays;

public class StudentDriver {

	public static void main(String[] args) {
		Student[] students = {
				new Student(3,"Dinga","dinga@gmail.com","male",LocalDate.of(2003, 12, 26)),
				new Student(5,"Dingi","Dingi@gmail.com","female",LocalDate.of(2004, 1, 26)),
				new Student(3,"Nigga","Nigga@gmail.com","male",LocalDate.of(2001, 7, 26)),
				new Student(1,"Niggi","Niggi@gmail.com","female",LocalDate.of(2003, 10, 26)),
				new Student(2,"Raju","Raju@gmail.com","male",LocalDate.of(2002, 2, 26))
		};
		
		//System.out.println(Arrays.toString(students));
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		System.out.println("============================================");
		
		Arrays.sort(students);
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		System.out.println("============================================");
		
		CompareName cn = new CompareName();
		Arrays.sort(students,cn);
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		
		System.out.println("============================================");
		
		Arrays.sort(students,(Student o1,Student o2)->o1.getName().compareTo(o2.getName()));
		
		for(Student stu:students) {
			System.out.println(stu);
		}
	}
	
}
