package Array2DQuestion;

public class Question2 {

	public static int[][] addingTwoMatrix(int[][]a,int[][]b){
		int [][]ans=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				ans[i][j]=a[i][j]+b[i][j];
			}
		}
		return ans;
	}
	
	public static void  printArray(int[][]a) {
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a[0].length;i++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{6,5,2},{9,3,8}};
		int[][]b= {{1,2,3},{6,5,2},{9,3,8}};
		printArray(addingTwoMatrix(a,b));
	}
	
}
