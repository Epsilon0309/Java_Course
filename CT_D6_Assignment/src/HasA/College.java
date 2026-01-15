package HasA;

public class College {

	private String name;
	private String location;
	private Student student;
	private Trainer trainer;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	
	public College() {
		
	}
	public College(String name, String location, Student student, Trainer trainer) {
		this.name = name;
		this.location = location;
		this.student = student;
		this.trainer = trainer;
	}
	
	public void print() {
		System.out.println("----------College-----------");
		System.out.println(this.name);
		System.out.println(this.location);
		
		System.out.println("----------Student-----------");
		//System.out.println(this.student.getId());
		System.out.println(getStudent().getId());
		
		System.out.println(student.getName());
		
		System.out.println("----------Trainer-----------");
		System.out.println(this.trainer.getName());
		System.out.println(this.trainer.getSubject());
		
	}
}
