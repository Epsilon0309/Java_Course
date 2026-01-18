package Array1DAssignments;

public class Question15 {
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

	public static void printPrimes(int []a) {
		System.out.println("Prime numbers: ");
		for(int i=0;i<a.length;i++) {
			if(is_prime(a[i])) {
				System.out.print(a[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		printPrimes(a);
	}
	
}
