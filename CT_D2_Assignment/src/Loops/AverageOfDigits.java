package Loops;

public class AverageOfDigits {
	public static void main(String[] args) {
		int a = 12348;
		float sum = 0;
		int digit = 0;
		while (a > 0) {
			int rem = a % 10;
			digit+=1;
			sum += rem;
			a = a / 10;
		}
		float average = sum / digit;
//		System.out.println(sum);
//		System.out.println(digit); 
		System.out.println(average);
		
	}
}
