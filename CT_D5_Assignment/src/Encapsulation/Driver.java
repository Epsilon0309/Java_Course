package Encapsulation;

public class Driver {
	public static void main(String[] args) {
//		Trainer t = new Trainer();
//		t.setId(23);
//		t.setName("Sahil");
//		t.setPassword(123);
//		
//		System.out.println(t.getId());
//		System.out.println(t.getName());
//		System.out.println(t.getPassword());

		
		Account ac=new Account();
		ac.setId(123);
		//ac.setBalance(-112233);
		ac.setBalance(112233);
		ac.setPassword(1234);
		
		System.out.println(ac.getId());
		System.out.println(ac.getPassword());
		System.out.println(ac.getBalance(1234));
		
	}
}
