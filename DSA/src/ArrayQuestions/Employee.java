package ArrayQuestions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	private int experience;
	private LocalDate date;
	private LocalTime timeOfBirth;
	private long salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, int experience, LocalDate date, LocalTime timeOfBirth,
			long salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.date = date;
		this.timeOfBirth = timeOfBirth;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTimeOfBirth() {
		return timeOfBirth;
	}

	public void setTimeOfBirth(LocalTime timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", experience=" + experience + ", date="
				+ date + ", timeOfBirth=" + timeOfBirth + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, email, experience, id, name, salary, timeOfBirth);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(date, other.date) && Objects.equals(email, other.email) && experience == other.experience
				&& id == other.id && Objects.equals(name, other.name) && salary == other.salary
				&& Objects.equals(timeOfBirth, other.timeOfBirth);
	}
	
}
