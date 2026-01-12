package Assignments;

import java.util.Scanner;

public class DecimalToHex {

	public static char hexValue(int num) {
		switch (num) {
		case 10: {
			return 'A';
		}
		case 11: {
			return 'B';
		}
		case 12: {
			return 'C';
		}
		case 13: {
			return 'D';
		}
		case 14: {
			return 'E';
		}
		default: {
			return 'F';
		}
		}
	}

	public static String decimalToHex(int num) {
		String ans = "";
		while(num>0) {
			int rem = num%16;
			if(rem>9) {
				ans = hexValue(rem)+ans;
			}else {
				ans = rem + ans;
			}
			num/=16;
		}
		return ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(decimalToHex(number));
	}

}
