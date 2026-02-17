package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2 {

	public static void main(String[] args) {
		int size = 10;
		int[] numbers = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+size+" nuber of the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		Arrays.sort(numbers);
		
		int p=sc.nextInt();
		int i=0;int sum=0;
		while(p>i) {
			if(numbers[i]<0) {
				sum+=Math.abs(numbers[i]);
			}
			i++;
		}
		System.out.println(sum);
		sc.close();
	}
	
}
