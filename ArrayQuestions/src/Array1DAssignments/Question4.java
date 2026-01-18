package Array1DAssignments;

public class Question4 {
	public static int arraySum(int[]a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		System.out.println(arraySum(a));
	}
}
