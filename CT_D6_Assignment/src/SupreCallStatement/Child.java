package SupreCallStatement;

public class Child extends Parent{
	
	long phone;
	
	public Child(String name, long phone) {
		super(name);
		this.phone=phone;
	}
	
	public static void main(String[] args) {
		Child c =new Child("XYZ",8888);
		System.out.println(c.name);
		System.out.println(c.phone);
	}

}
