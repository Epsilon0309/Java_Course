package Assignments;

import java.util.Scanner;

public class CountEvenOdd {

	public static boolean evenOddCount(int num) {
		int even = 0, odd = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			num /= 10;
		}

		if (even == odd) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if (evenOddCount(num)) {
			System.out.println("Equal even and odd digits");
		} else {
			System.out.println("Even and odd digits are not equal");
		}

	}

}
