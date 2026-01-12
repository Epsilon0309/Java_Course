package Assignments;

import java.util.Scanner;

public class BinaryToDecimal {

	public static int power(int base, int power) {
		int ans = 1;
		for (int i = 1; i <= power; i++) {
			ans *= base;
		}
		return ans;
	}

	public static int binaryToDecimal(long num) {
		int ans = 0;
		int placeValue = 0;
		while (num > 0) {
			long rem = num % 10;
			if (rem == 1) {
				ans = ans + power(2, placeValue);
			}
			num /= 10;
			placeValue += 1;
		}
		return ans;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long number = sc.nextLong();

		System.out.println(binaryToDecimal(number));

	}
}
