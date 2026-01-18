package Array1DAssignments;

public class Question29 {
	public static int[] zigzagArray(int[]a,int[]b) {
		int length = a.length+b.length;
		int []ans = new int[length];
		
		int usefulLength = (a.length<b.length)?a.length:b.length;
		
		for(int i=0;i<(2*usefulLength);i++) {
			if(i%2==0) {
				ans[i]=a[i/2];
			}else {
				ans[i]=b[i/2];
			}
		}
		
		if(a.length>b.length) {
			for(int i=2*b.length;i<length;i++) {
				ans[i]=a[i-b.length];
			}
		}
		else {
			for(int i=2*a.length;i<length;i++) {
				ans[i]=b[i-a.length];
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
		int []a= {10,7,8};
		int[]b= {5,6,10,20,8};
		
		printInputInt(zigzagArray(a,b));
		
	}
}
