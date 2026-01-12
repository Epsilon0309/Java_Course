package Conditional_statement;

public class MonthNoValid {
	public static void main(String[] args) {
		int monthNo = 13;
		if (monthNo >= 1 && monthNo <= 12) {
			System.out.println("Valid month number");
		} else {
			System.out.println("Invalid month number");
		}
	}
}
