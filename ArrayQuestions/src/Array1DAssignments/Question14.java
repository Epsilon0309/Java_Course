package Array1DAssignments;

public class Question14 {
	

	public static int frequency(int num,int[]a) {
		int ans=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				ans++;
			}
		}
		return ans;
	}
	
	public static int[] uniqueElementsInArray(int[]a) {
		int []ans1 = new int[a.length];
		int i=0;int k=0;
		ans1[k]=a[i];
		k++;
		for(i=1;i<a.length;i++) {
			if(frequency(a[i],a)==1) {
				ans1[k]=a[i];
				k++;
			}
		}
		
		int []ans=new int[k];
		for(int j=0;j<k;j++) {
			ans[j]=ans1[j];
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

		int[]b= {5,6,10,20,10,20,7};
		
		printInputInt(uniqueElementsInArray(b));
		
	}

}
