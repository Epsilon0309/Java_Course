package Basic;

public class PrimeNumber {

	public static int countFactors(int a) {
		int count=0;
		for(int i=1;i*i<=a;i++) {
			if(a%i==0) {
				count+=2;
			}
		}
		return count;
	}
	
	public static boolean checkPrime(int a) {
		boolean ans = true;
		if(countFactors(a)>2) {
			ans=false;
			return ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(checkPrime(17));
	}
	
}
