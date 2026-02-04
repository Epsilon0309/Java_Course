package Recursion;

public class RecursionExample {
	
	public static void modify(int []a) {
		a[0]= Integer.MIN_VALUE;
	}

	public static void printNumber(int n) {
		
		if(n==0) {
			return;
		}

		System.out.print(n+" ");
		
		printNumber(n-1);
		
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7};
		System.out.println(arr);
		modify(arr);
		System.out.println(arr);
		
		
		printNumber(10);
	}
	
}
