package Recursion;

public class SumofNNaturalNumbers {

	public static int sum(int a) {
		if(a==0) {
			return 0;
		}
		return a+sum(a-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
}
