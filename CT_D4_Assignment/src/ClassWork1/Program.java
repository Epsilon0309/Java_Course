package ClassWork1;

public class Program {

	public static boolean palindrome(int a) {
		int original=a;
		int  ans=0;
		while(a>0) {
			int rem=a%10;
			ans=(ans*10)+rem;
			a/=10;
		}
		if(original==ans) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int num) {
		if (num<=1 ) {
			return false;
		}
		else if(num==2) {
			return true;
		}
		int count=0;
		for(int i=3;i*i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			if(count>0) {
				return false;
			}
		}

		return true;

	}
	
}
