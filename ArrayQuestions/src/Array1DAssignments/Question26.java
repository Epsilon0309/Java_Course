package Array1DAssignments;

public class Question26 {
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

	public static void printArray(int []arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int []a= {3,5,2,7,4,6,1,5,3};
		printArray(bubbleSort(a));
	}
	
}
