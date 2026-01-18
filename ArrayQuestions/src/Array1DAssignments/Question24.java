package Array1DAssignments;

public class Question24 {
	
	public static boolean linearSearch(int ele,int []a) {
		boolean ans=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				ans=true;
				break;
			}
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
		System.out.println(linearSearch(6,a));
	}

}
