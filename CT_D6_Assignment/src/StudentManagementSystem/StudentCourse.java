package StudentManagementSystem;

public class StudentCourse {

	public static void showStudentCourseDetails(Student s) {

		System.out.println("-------Person Properties--------");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println("-------Student Properties--------");
		System.out.println(s.getRollNumber());
		System.out.println(s.getGrade());
		System.out.println("-------Course Properties--------");
		System.out.println(s.getC().getCourseId());
		System.out.println(s.getC().getCourseName());
	}
	
	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCourseId(012);
		c1.setCourseName("Java");
		
		Student s1 = new Student();
		s1.setName("Sahil");
		s1.setAge(22);
		s1.setRollNumber(123);
		s1.setGrade(9.3f);
		s1.setC(c1);
		
		showStudentCourseDetails(s1);
		
	}
	
}
