package Array1DAssignments;

public class Question5 {
	public static int arrayProduct(int[]a) {
		int prod=1;
		for(int i=0;i<a.length;i++) {
			prod*=a[i];
		}
		return prod;
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		System.out.println(arrayProduct(a));
	}
}
