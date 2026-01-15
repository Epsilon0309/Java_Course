package StudentManagementSystem;

public class Student extends Person{

	private int rollNumber;
	private float grade;
	private Course c;
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}	
	
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	
	
}
