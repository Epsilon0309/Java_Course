package Basic;

public class PrintArrayInReverseDirection {
	
	public static int[] reverseArray(int[]a) {
		int start=0;int end=a.length-1;
		while(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;end--;
		}
		return a;
	}
	
	public static void printArray(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		
		printArray(reverseArray(arr));
	}
	
}
