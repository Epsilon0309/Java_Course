package MethodsWithReturnType;

public class Power {

	public static int power(int base, int power) {
		int ans = 1;
		for (int i = 1; i <= power; i++) {
			ans *= base;
		}
		return ans;
	}
	
	public static int countDigit(int i) {
		int ans =0;
		while(i>0) {
			ans++;
			i/=10;
		}
		return ans;
	}

	public static void main(String[] args) {
		int base = 2, power = 4;
		int ans = countDigit(12563);
		
		System.out.println(power(base, power));
		System.out.println(ans);
	}

}
