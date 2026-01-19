package Array2DQuestion;

public class Question1 {

	public static void largestSmallestIn2D(int[][] a) {
		int largest = a[0][0];
		int smallest = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (largest < a[i][j]) {
					largest = a[i][j];
				}
				if (smallest > a[i][j]) {
					smallest = a[i][j];
				}
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}
	
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{6,5,2},{9,3,8}};
		largestSmallestIn2D(a);
	}

}
