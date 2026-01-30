package Basic;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		int [][]arr= {
				{1,2,3},
				{1,2,3,4,5,6},
				{21}
		};
		
		int[][] arr1 = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println();
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//		}

		for(int i=0;i<arr1.length;i++) {
			System.out.println();
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]!=Integer.MIN_VALUE) {
				System.out.print(arr1[i][j]+" ");}
			}
		}

		arr1[0][0]= Integer.MIN_VALUE;
		arr1[2][3]= Integer.MIN_VALUE;
		
		System.out.println();
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println();
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]!=Integer.MIN_VALUE) {
				System.out.print(arr1[i][j]+" ");}
			}
		}
	}
	
}
