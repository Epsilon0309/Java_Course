package MethodsWithReturnType;

public class Prime {

	public static boolean is_prime(int a) {
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int num = 20;
		if (is_prime(num)) {
			System.out.println("Prime ");
		} else {
			System.out.println("not a prime");
		}
		
        byte b=127;
        b++;
        System.out.println(b);
	}
}
