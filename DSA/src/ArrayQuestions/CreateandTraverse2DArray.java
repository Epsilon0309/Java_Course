package ArrayQuestions;

import java.util.ArrayList;

public class CreateandTraverse2DArray {
	
	public static void print2DArray(int[][]a) {
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][]a = new int[3][3];
		a[0][0]=1;a[0][1]=1;a[0][2]=1;
		a[1][0]=1;a[1][1]=1;a[1][2]=1;
		a[2][0]=1;a[2][1]=1;a[2][2]=1;
		
		print2DArray(a);
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<>();
		al.add(new ArrayList<>());
		al.get(0).add(1); al.get(0).add(2);

		al.add(new ArrayList<>());
		al.get(1).add(3); al.get(1).add(4);
		
		System.out.println();
		System.out.println(al);
	}
}
