package Array1DAssignments;

public class Question25 {
	
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		return arr;
	}
	
	public static boolean binarySearch(int num,int []a) {
		boolean ans=false;
		int start=0;int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(a[mid]==num) {
				ans=true;
				break;
			}
			else if(a[mid]>num) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int []a= {3,5,2,7,4,6,1,5,3};
		System.out.println(binarySearch(8,bubbleSort(a)));
	}

}
