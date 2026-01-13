package Constructor;

public class Employee {
	public Employee() {
		System.out.println("C1");
	}
	public Employee(int a) {
		this();
		System.out.println("C2");
	}
	public static void main(String[] args) {
		Employee e= new Employee(2);
	}
}
