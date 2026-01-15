package HasA;

public class Trainer {

	private String name;
	private String subject;
	private Student student;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Trainer() {
		
	}
	public Trainer(String name, String subject, Student student) {
		this.name = name;
		this.subject = subject;
		this.student = student;
	}
	
}
