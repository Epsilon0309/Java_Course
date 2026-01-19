package Abstraction;

public class HDFC extends Bank{

	public void getInterestRate() {
		System.out.println("Interest rate is 6.55%");
	}
	
	public static void main(String[] args) {
		Bank b = new HDFC();
		b.getInterestRate();
		
		Bank s = new SBI();
		s.getInterestRate();
	}
}
