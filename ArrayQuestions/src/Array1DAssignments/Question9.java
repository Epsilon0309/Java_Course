package Array1DAssignments;

public class Question9 {

	public static int largestElement(int []a) {
		int largest = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		return largest;
	}
	
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		System.out.println(largestElement(a));
	}
	
}
