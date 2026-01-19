package Abstraction;

public class JuniorDeva extends Deva{

	@Override
	public void goldLoan() {
		System.out.println("Junior deva paid gold loan");
	}
	
	public void bike() {
		System.out.println("BMW");
	}
	
	public static void main(String[] args) {
		JuniorDeva j = new JuniorDeva();
		j.homeLoan();
		j.goldLoan();
		j.bike();
		
		Parent p = new JuniorDeva();//UC
		p.homeLoan();
		p.goldLoan();
		
		Deva d = new JuniorDeva();
		d.homeLoan();
		d.goldLoan();
	}
	
}
