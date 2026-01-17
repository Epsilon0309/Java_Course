package TwoDimensionalArray;

// import java.util.Scanner;

public class RowWiseSum {

	public static void rowWiseSum(int[][]a) {
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				sum+=a[i][j];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
int[][] a = new int[2][3];
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = sc.nextInt();
//			}
//
//		}
		
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[1][2]=60;

		System.out.println("Printing elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		rowWiseSum(a);

	}

}
