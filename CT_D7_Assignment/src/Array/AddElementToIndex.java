package Array;

public class AddElementToIndex {
	
	public static int[] addElementToIndex(int[]arr,int ele,int index) {
		int []ans = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			ans[i]=arr[i];
		}
		ans[index]=ele;
		for(int i=index+1;i<=arr.length;i++) {
			ans[i]=arr[i-1];
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
		
		printInputInt(addElementToIndex(b,16,2));
		
	}

}
