package Array1DAssignments;

public class Question8 {
	
	public static int[] reverseArrayUsingNewArray(int[]a) {
		int []ans = new int[a.length];
		int i=0;int j=a.length-1;
		while(j>=0) {
			ans[i]=a[j];
			i++;j--;
		}
		return ans;
	}

	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		print(reverseArrayUsingNewArray(a));
	}

}
