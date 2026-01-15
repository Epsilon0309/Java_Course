package HasA;

public class CollegeStudentTrainerDriver {
	
	public static void main(String[] args) {

//		Student s= new Student(420,"Sahil");
//		Trainer t =new Trainer("Animesh","Jakhusi",s);
//		College c= new College("IEM","Saltlake",s,t);
		
		Student s= new Student();
		s.setId(123);
		s.setName("Sahil");
		
		Trainer t = new Trainer();
		t.setName("Animesh");
		t.setSubject("Coding");
		t.setStudent(s);
		
		College c = new College();
		c.setName("IEM");
		c.setLocation("Sector-V");
		c.setStudent(s);
		c.setTrainer(t);
		
		c.print();
	}

	
	
	
}
