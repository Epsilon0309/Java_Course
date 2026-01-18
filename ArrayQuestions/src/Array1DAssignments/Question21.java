package Array1DAssignments;

public class Question21 {
	
	public static int[] sortingArray(int[]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		print(sortingArray(a));
	}

}
