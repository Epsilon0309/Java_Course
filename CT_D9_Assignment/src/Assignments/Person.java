package Assignments;

public class Person {

	private AadharCard aadhar;
	private DrivingLiscence drivingLiscence;
	public AadharCard getAadhar() {
		return aadhar;
	}
	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}
	public DrivingLiscence getDrivingLiscence() {
		return drivingLiscence;
	}
	public void setDrivingLiscence(DrivingLiscence drivingLiscence) {
		this.drivingLiscence = drivingLiscence;
	}
	
	public Person(){
		aadhar = new AadharCard();
	}
	
	public static void main(String[] args) {
		Person person = new Person(); // by default the engine object is created
		person.aadhar.aadharCard();
		
		person.setDrivingLiscence(new DrivingLiscence()); // externally we have to create the object
		person.drivingLiscence.drivingLiscence();
	}
	
}

class AadharCard{
	public void aadharCard() {
		System.out.println("Aadhar card is necessary");
	}
}

class DrivingLiscence{
	public void drivingLiscence() {
		System.out.println("Driving liscence is not necessary");
	}
}
