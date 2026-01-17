package Array;

public class ReverseArray {
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void reverseArray(int[]a) {
		int front=0;
		int  end = a.length -1;
		while(front<=end) {
			int temp=a[front];
			a[front]=a[end];
			a[end]=temp;
			front++;end--;
		}
		
		printInputInt(a);
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		reverseArray(a);
	}
	
}
