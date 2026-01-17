package Array;

public class ReplaceElementFromIndex {
	
	public static int[] replaceElementFromIndex(int[]arr,int ele,int index) {
		arr[index]=ele;
		return arr;
	}

	
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int []a= {1,7,8};
		int[]b= {5,6,10,20};
		
		printInputInt(replaceElementFromIndex(b,18,2));
		
	}
}
