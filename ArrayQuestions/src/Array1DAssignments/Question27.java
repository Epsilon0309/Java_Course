package Array1DAssignments;

public class Question27 {

	public static void printFirstLast(int[]a) {
		int first=0;
		int last = a.length-1;
		System.out.println(a[first]);
		System.out.println(a[last]);
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		printFirstLast(a);
	}
	
}
