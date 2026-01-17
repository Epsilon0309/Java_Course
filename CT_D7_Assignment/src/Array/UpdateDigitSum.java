package Array;

public class UpdateDigitSum {

	public static int digitSum(int a) {
		int sum=0;
		while(a>0) {
			int rem = a%10;
			sum+=rem;
			a/=10;
		}
		return sum;
	}
	
	public static int[] updateDigitSum(int[]a) {
		for(int i=0;i<a.length;i++) {
			a[i]=digitSum(a[i]);
		}
		return a;
	}
	
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]a = {12,23,34,456,567,6789};
		printInputInt(updateDigitSum(a));
	}
	
}
