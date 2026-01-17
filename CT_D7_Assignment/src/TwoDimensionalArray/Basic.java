package TwoDimensionalArray;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][]a=new int[sc.nextInt()][sc.nextInt()];
		
//		a[0][0]=10;
//		a[0][1]=20;
//		a[0][2]=30;
//		a[1][0]=40;
//		a[1][1]=50;
//		a[1][2]=60;
		
		System.out.println("Enter "+(a.length*a[0].length)+" elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}

		}
		
		System.out.println("Printing elements:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
