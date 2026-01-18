package Array1DAssignments;

public class Question18 {
	public static int[] removeElementFromIndex(int[]arr,int index) {
		int []ans = new int[arr.length-1];
		for(int i=0;i<arr.length;i++) {
			if(i<index) {
				ans[i]=arr[i];
			}
			else if(i==index) {
				continue;
			}
			if(i>index) {
				ans[i-1]=arr[i];
			}
		}

		return ans;
	}
	
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int[]b= {5,6,10,20};
		
		printInputInt(removeElementFromIndex(b,2));
		
	}
}
