package Assignments;

public class Driver {

	public static void main(String[] args) {
		Spotify s = new Spotify();
		s.phoneNumber = 9876543210l;
		s.setHaveAccount(true);
		s.setUserName("epsilon");
		
		System.out.println(s.getHaveAccount());
		System.out.println(s.phoneNumber);
		System.out.println(s.getUserName(s.getHaveAccount()));
		
	}
}
