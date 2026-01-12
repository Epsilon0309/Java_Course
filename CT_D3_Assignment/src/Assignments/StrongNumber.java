package Assignments;

public class StrongNumber {

	public static int factorial(int num) {
		int ans=1;
		if(num<0) {
			return -1;
		}
		else if(num==0) {
			return 1;
		}
		else {
			while(num>0) {
				ans*=num;
				num--;
			}
			return ans;
		}
	}
	
	public static boolean strongNumber(int num) {
		int original = num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum+=factorial(rem);
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
		int num =143;
		if(strongNumber(num)) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Weak Number");
		}
	}
	
}
