package Encapsulation;

public class Account {

	private int id;
	private long balance;
	private int password;
	
	public int getId() {
		return id;
	}
	
	public long getBalance(int pass) {
//		int actualPass=this.getPassword();
//		if(actualPass==pass) {
//			return balance;
//		}
		if(this.password==pass) {
			return balance;
		}
		else {
			System.out.println("Invalid Password");
			return 0;
		}
	}
	
	public int getPassword() {
		return password;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setBalance(long bal) {
		if(bal<=0) {
			System.out.println("Invalid balance9662");
		}
		else {
			this.balance=bal;
		}
	}
	
	public void setPassword(int pass) {
		this.password=pass;
	}
	
	
}
