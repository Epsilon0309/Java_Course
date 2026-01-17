package Array;

public class ReturnEvenArray {

	public static int[] countEvenElements(int []a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		
		int []ans=new int[count];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				ans[j]=a[i];
				j++;
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
		int[]a= {1,2,3,4,5,6,7,8};
		int []ans = countEvenElements(a);
		printInputInt(ans);
	}
}
