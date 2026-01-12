package MethodsWithReturnType;

public class ArmstrongNumber {
	public static int power(int base, int power) {
		int ans = 1;
		for (int i = 1; i <= power; i++) {
			ans *= base;
		}
		return ans;
	}

	public static int countDigit(int i) {
		int ans = 0;
		while (i > 0) {
			ans++;
			i /= 10;
		}
		return ans;
	}

	public static boolean isArmstrong(int a) {
		int digit = countDigit(a);
		int previous = a;
		int ans = 0;
		for (int i = 1; i <= digit; i++) {
			int rem = a % 10;
			ans += power(rem, digit);
			a = a / 10;
		}
		if (previous == ans) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int a = 1634;
		if (isArmstrong(a)) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
