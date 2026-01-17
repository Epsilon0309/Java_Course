package Array;

public class RemoveDuplicateElements {

	public static int frequency(int num,int[]a) {
		int ans=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				ans++;
			}
		}
		return ans;
	}
	
	public static int[] removeDuplicateArray(int[]a) {
		int []ans1 = new int[a.length];
		int i=0;int k=0;
		for(;i<a.length;i++) {
			if(frequency(a[i],a)!=0 && frequency(a[i],ans1)!=0) {
				ans1[k++]=a[i];
			}
		}
		
		return ans1;
	}
	
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int []a= {1,7,8};
		int[]b= {5,6,10,20,10,20,7};
		
		printInputInt(removeDuplicateArray(b));
		
	}
}
