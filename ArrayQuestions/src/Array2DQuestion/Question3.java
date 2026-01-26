package Array2DQuestion;

public class Question3 {

	public static int[][] matrixMultiply(int[][]m1,int[][]m2){
		if(m1[0].length!=m2.length) {
			return null;
		}
		int row2=m1[0].length;
		int rowm1=m1.length; int colm2 = m2[0].length;
		int[][]ans=new int[rowm1][colm2];
		for(int i=0;i<rowm1;i++) {
			for(int j=0;j<colm2;j++) {
				for(int k=0;k<row2;k++) {
					ans[i][j]+=m1[i][k]*m2[k][j];
				}
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
		printArray(matrixMultiply(a,b));
	}
	
}
