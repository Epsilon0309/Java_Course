package Assignments;

public class HappyNumber {
	public static int sumOfSquares(int num) {
		int ans = 0;
		while(num>0) {
			int rem=num%10;
			ans+=(rem*rem);
			num/=10;
		}
		return ans;
	}

	public static boolean happyNumber(int num) {
		int n=sumOfSquares(num);
		while(n!=1) {
			n=sumOfSquares(n);
			if(n==4) {
				return false;
			}
		}
			return true;
		
	}
	
	public static void main(String[] args) {
		int a=16;
		System.out.println(happyNumber(a)?"Good":"Bad");
	}
	
}
