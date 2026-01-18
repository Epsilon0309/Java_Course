package Array1DAssignments;

public class Question10 {
	
	public static int secondLargest(int []a) {
		int largest=a[0];int secondLargest= a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondLargest = largest;
				largest=a[i];
			}
			if(a[i]>secondLargest && a[i]!=largest) {
				secondLargest=a[i];
			}
		}
		return secondLargest;
	}

	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		System.out.println(secondLargest(a));
	}
}
