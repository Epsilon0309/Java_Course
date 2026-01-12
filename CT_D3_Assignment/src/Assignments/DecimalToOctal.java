package Assignments;

import java.util.Scanner;

public class DecimalToOctal {
	public static long decimalToOctal(int num) {
		long ans=0;
		int placeValue=1;
		while(num>0) {
			int rem=num%8;
			ans=ans+rem*placeValue;
			num/=8;
			placeValue*=10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("Octal value of the number is:"+decimalToOctal(number));
		
	}
}
