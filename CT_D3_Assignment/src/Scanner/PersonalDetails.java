package Scanner;

import java.util.Scanner;

public class PersonalDetails {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name: ");
	String name = sc.nextLine();
	System.out.println("Enter weight: ");
	float weight = sc.nextFloat();
	System.out.println("Enter age: ");
	byte age = sc.nextByte();
	System.out.println("Enter phone: ");
	long phone = sc.nextLong();
	System.out.println("Enter email: ");
	String email = sc.next();
	System.out.println("Enter gender: ");
	char gender = sc.next().charAt(0);
	System.out.println("Enter student: ");
	boolean student = sc.nextBoolean();

	
	System.out.println(name);
	System.out.println(weight);
	System.out.println(age);
	System.out.println(phone);
	System.out.println(email);
	System.out.println(gender);
	System.out.println(student);

	
}
}
