package ArrayQuestions;

import java.util.ArrayList;

public class CreateandTraverse1DArray {
	
	public static void print1DArray(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[]a = new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		
		print1DArray(a);
		
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println();
		System.out.println(al);
	}
}
