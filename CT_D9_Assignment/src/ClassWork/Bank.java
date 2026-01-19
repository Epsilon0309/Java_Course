package ClassWork;

public interface Bank {

	void bankName();

	void hasAccount();

}

class SBI implements Bank {

	public void bankName() {
		System.out.println("SBI");
	}

	public void hasAccount() {
		System.out.println("User has account in the SBI bank");
	}
}

class HDFC implements Bank {

	public void bankName() {
		System.out.println("HDFC");
	}

	public void hasAccount() {
		System.out.println("User has account in the HDFC bank");
	}
}

class PNB implements Bank {

	public void bankName() {
		System.out.println("PNB");
	}

	public void hasAccount() {
		System.out.println("User has account in the PNB bank");
	}
}
