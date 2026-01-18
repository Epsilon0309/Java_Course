package Array1DAssignments;

public class Question23 {

	public static boolean is_prime(int a) {
		if(a==1) {
			return false;
		}
		for (int i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int frequency(int num,int[]a) {
		int ans=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				ans++;
			}
		}
		return ans;
	}
	
	public static void duplicatePrime(int[]a) {
		for(int i=0;i<a.length;i++) {
			if(is_prime(a[i])) {
				if(frequency(a[i],a)>1) {
					System.out.println(a[i]+" is duplicate prime.");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,7,6,5,4,6,7};
		duplicatePrime(a);
	}
	
}
