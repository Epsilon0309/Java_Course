package Array;

import java.util.Scanner;

public class PassArray {
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void printInputString(String []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		printInputInt(a);
		
		String[] s= {"ab","cd","ef"};
		printInputString(s); 
		
	}
}
