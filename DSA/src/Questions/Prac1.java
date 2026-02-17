package Questions;

import java.util.Arrays;
import java.util.Scanner;

//  N=10
//	x=4
//	y=6
//	arr = {2,3,12,15,20,25,35,45,55,90}
//  ans = 35-25-1=9

public class Prac1 {
	
	public static void main(String[] args) {
		int size = 10;
		int[] numbers = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+size+" nuber of the array");
		for(int i=0;i<size;i++) {
			numbers[i]=sc.nextInt();
		}
		Arrays.sort(numbers);
		
		int x=sc.nextInt();
		int y=size-x;
		int p = numbers[y]-numbers[y-1]-1;
		System.out.println(p);
		sc.close();
	}

	
}
