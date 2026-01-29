package Basic;

public class SumOfNumbers {

	public static int sumOfNNumber(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int sumOfNNumberOptimal(int a) {
		int sum=((a*(a+1))/2);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOfNNumber(24));
		System.out.println(sumOfNNumberOptimal(24));
	}
	
}
