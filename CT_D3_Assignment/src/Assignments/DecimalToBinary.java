package Assignments;

import java.util.Scanner;

public class DecimalToBinary {

	public static long decimalToBinary(int num) {
		long ans=0;
		int placeValue=1;
		while(num>0) {
			int rem=num%2;
			ans=ans+rem*placeValue;
			num/=2;
			placeValue*=10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(decimalToBinary(number));
		
	}
}
