package Array;

public class mergeSortedArray {
	
	public static int[] mergeTwoSortedArray(int[]a,int[]b) {
		int length=a.length+b.length;
		int []ans = new int[length];
		int i=0;int j=0;int k=0;
		for(;i<a.length && j<b.length;k++) {
			
			if(a[i]<b[j]) {
				ans[k]=a[i];
				i++;
			}
			else {
				ans[k]=b[j];
				j++;
			}
		}
		
		while(i<a.length) {
			ans[k++]=a[i++];
		}
		
		while(j<b.length) {
			ans[k++]=b[j++];
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
		int []a= {1,7,8};
		int[]b= {5,6,10,20};
		
		printInputInt(mergeTwoSortedArray(a,b));
		
	}

}
