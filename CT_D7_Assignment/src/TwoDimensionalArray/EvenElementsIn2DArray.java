package TwoDimensionalArray;

import java.util.Scanner;

public class EvenElementsIn2DArray {
	
	public static void evenElementIndex(int[][]a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]%2==0) {
					System.out.println(a[i][j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[sc.nextInt()][sc.nextInt()];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}

		}

		System.out.println("Printing elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		evenElementIndex(a);
	}
}
