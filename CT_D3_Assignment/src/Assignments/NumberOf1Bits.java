package Assignments;

import java.util.Scanner;

public class NumberOf1Bits {

	public static int numberOfBits1(int num) {
		int ans = 0;
		while (num > 0) {
			int rem = num % 2;
			if(rem==1) {
				ans++;
			}
			num /= 2;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(numberOfBits1(number));
	}
}
