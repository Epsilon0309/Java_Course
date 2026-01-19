package NonPrimitiveArray;

public class Student {
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		this.id=id;
		this.name=name;
		this.marks= marks;
	}
	
	public static Student[] passedStudent(int passMarks,Student[]s) {
		Student[]ans=new Student[s.length];
		int count=0;
		for(Student a:s) {
			if(a.marks>=passMarks) {
				count++;
				System.out.println();
				System.out.print("id: "+a.id);
				System.out.print("id: "+a.name);
				System.out.print("id: "+a.marks);
			}
		}
		
		Student[]ans1 = new Student[count];
		for(int i=0;i<count;i++) {
			ans1[i]=ans[i];
		}
		
		return ans1;
		
	}

}
