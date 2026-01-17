package Array;

import java.util.Scanner;

public class ArraySum {

	public static void arraySum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Size: ");
		int size = sc.nextInt();
		int []a=new int [size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<size;i++) {
			sum+=a[i];
		}
		
		System.out.println("Sum: "+sum);
		
	}
	
	public static void main(String[] args) {
		arraySum();
	}
	
}
