package Hashmap;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int employeeId;
	private String employeename;
	private String gender;
	private LocalDate dateofbirth;
	private int experience;
	private String email;
	private long phonenumber;
	
	@Override
	public String toString() {
		//System.out.println("toString invoked");
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + ", gender=" + gender
				+ ", dateofbirth=" + dateofbirth + ", experience=" + experience + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode invoked");
		return Objects.hash(dateofbirth, email, employeeId, employeename, experience, gender, phonenumber);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals invoked");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(dateofbirth, other.dateofbirth) && Objects.equals(email, other.email)
				&& employeeId == other.employeeId && Objects.equals(employeename, other.employeename)
				&& experience == other.experience && Objects.equals(gender, other.gender)
				&& phonenumber == other.phonenumber;
	}

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeename, String gender, LocalDate dateofbirth, int experience,
			String email, long phonenumber) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.experience = experience;
		this.email = email;
		this.phonenumber = phonenumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}


	public static void main(String[] args) {
		
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("compare to invoked");
		return this.employeeId-o.employeeId;
	}
	
}
