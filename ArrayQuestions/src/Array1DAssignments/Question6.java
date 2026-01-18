package Array1DAssignments;

public class Question6 {

	public static int[] reverseArray(int[]a) {
		int start=0;int end=a.length-1;
		while(start<=end) {
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;end--;
		}
		return a;
	}
	

	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		print(reverseArray(a));
	}
	
}
