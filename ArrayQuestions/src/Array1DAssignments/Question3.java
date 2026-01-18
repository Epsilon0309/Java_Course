package Array1DAssignments;

public class Question3 {
	public static void printOdd(int[]a) {
		for(int i=0;i<a.length;i+=2) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		printOdd(a);
	}
}
