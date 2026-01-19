package NonPrimitiveArray;

import java.util.Scanner;

public class StudentDriver {
	
	public static void print(Student[]s) {
		System.out.println("Passed Student: ");
		for(Student a:s) {
			System.out.println();
			System.out.print("id: "+a.id+" ");
			System.out.print("id: "+a.name+" ");
			System.out.print("id: "+a.marks);
		}

	}
	
//	public static Student[] passedStudent(int passMarks,Student[]s) {
//		Student[]ans=new Student[s.length];
//		int count=0;
//		for(Student a:s) {
//			if(a.marks>=passMarks) {
//				count++;
//				System.out.println();
//				System.out.print("id: "+a.id);
//				System.out.print("id: "+a.name);
//				System.out.print("id: "+a.marks);
//			}
//		}
//		
//		Student[]ans1 = new Student[count];
//		for(int i=0;i<count;i++) {
//			ans1[i]=ans[i];
//		}
//		
//		return ans1;
//		
//	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int number = sc.nextInt();
		Student[] student = new Student[number];
		int i=0;
		while(i<number) {
			System.out.println("Enter the id of student: ");
			int id = sc.nextInt();
			System.out.println("Enter the name of student: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the number of student: ");
			int marks = sc.nextInt();
			student[i]= new Student(id,name,marks);
			i++;
		}
		
		System.out.println("Enter passing marks: ");
		int passingMarks = sc.nextInt();
		
		Student []ans = Student.passedStudent(passingMarks,student);
		print(ans);
		
	}

}
