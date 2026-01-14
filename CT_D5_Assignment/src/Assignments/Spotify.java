package Assignments;

public class Spotify {
	
	private String userName;
	long phoneNumber;
	private boolean haveAccount;
	
	public String getUserName(boolean haveAccount) {
		if(haveAccount==true) {
			return userName;
		}
		System.out.println("You don't have account");
		return null;
	}
	
	public boolean getHaveAccount() {
		return haveAccount;
	}
	
	public void setUserName(String username) {
		this.userName=username;
	}
	
	public void setHaveAccount(boolean haveAccount) {
		if(haveAccount==true) {
			System.out.println("You already have account");
		}
		this.haveAccount=haveAccount;
	}
	
}
