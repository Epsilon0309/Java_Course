package Assignments;

public class DiseriumNumber {
	
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

	public static boolean diserium(int num) {
		int original=num;
		int digit = countDigit(num);
		int sum=0;
		while(num>0) {
			int rem=num%10;
			if(digit>=1) {
				sum+=power(rem,digit);
			}
			digit--;
			num/=10;
		}
		
		if(original==sum) {
			return true;
		}
		else {
			return false;
		}
		
	}
public static void main(String[] args) {
	int number=175;
	System.out.println(diserium(number));
}
}
