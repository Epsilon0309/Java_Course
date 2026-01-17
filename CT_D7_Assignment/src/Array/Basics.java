package Array;

import java.util.Scanner;

public class Basics {
	
	public static void takeInputInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int[]ab = new int[sc.nextInt()];
		for(int i=0;i<ab.length;i++) {
			ab[i] = sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println();
	}
	public static void takeInputBoolean() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		boolean[]ab = new boolean[sc.nextInt()];
		for(int i=0;i<ab.length;i++) {
			ab[i] = sc.nextBoolean();
		}
		System.out.println();
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println();
	}
	public static void takeInputChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		char[]ab = new char[sc.nextInt()];
		for(int i=0;i<ab.length;i++) {
			ab[i] = sc.next().charAt(0);
		}
		System.out.println();
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println();
	}
	public static void takeInputFloat() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		float[]ab = new float[sc.nextInt()];
		for(int i=0;i<ab.length;i++) {
			ab[i] = sc.nextFloat();
		}
		System.out.println();
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println();
	}
	public static void takeInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		String[]ab = new String[sc.nextInt()];
		for(int i=0;i<ab.length;i++) {
			ab[i] = sc.next();
		}
		System.out.println();
		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
//		int[] a = new int [3];
//		char[] c = new char [3];
//		boolean[] b = new boolean [3];
//		float[] f = new float [3];
//		String[] s = new String [3];
//		
//		a[0]=1;a[1]=2;a[2]=3;
//		b[0]=true;b[1]=false;b[2]=true;
//		c[0]='a';c[1]='b';c[2]='c';
//		f[0]=1.1f;f[1]=2.2f;f[2]=3.3f;
//		s[0]="Sahil";s[1]="Animesh";s[2]="Sombit";
//		
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println();
//		
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]);
//		}
//		System.out.println();
//		for(int i=0;i<c.length;i++) {
//			System.out.print(c[i]);
//		}
//		System.out.println();
//		for(int i=0;i<f.length;i++) {
//			System.out.print(f[i]);
//		}
//		System.out.println();
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i]);
//		}
//		System.out.println();
		
		takeInputInt();
		takeInputBoolean();
		takeInputChar();
		takeInputFloat();
		takeInputString();
		
		
	}
	
}
