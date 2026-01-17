package Array;

import java.util.Scanner;

public class ArrayEvenOddSum {

	public static void arrayEvenOddSum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Size: ");
		int size = sc.nextInt();
		int []a=new int [size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int evenSum = 0; int oddSum=0;
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				evenSum+=a[i];
			}
			else {
				oddSum+=a[i];
			}
		}
		
		System.out.println("Evensum: "+evenSum);
		System.out.println("Oddsum: "+oddSum);
		
	}
	
	public static void main(String[] args) {
		arrayEvenOddSum();
	}
}
