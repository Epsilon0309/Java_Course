package Array1DAssignments;

public class Question7 {
	
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void printCopyArray(int []a) {
		int []copy = a;
		print(copy);
	}
	
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		printCopyArray(a);
	}

}
