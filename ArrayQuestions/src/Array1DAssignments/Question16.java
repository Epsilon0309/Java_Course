package Array1DAssignments;

public class Question16 {

	public static void printFibonacciElements(int[]a) {
		if(a.length<2) {
			System.out.println("Not possible");
		}
		for(int i=2;i<a.length;i++) {
			if((a[i-2]+a[i-1])==a[i]) {
				System.out.println(a[i]+" is fibonacci element of "+a[i-2]+" and "+a[i-1]);
			}
		}
	}
	
	public static void main(String[] args) {
		int []a= {1,2,3,5,8,9,10};
		printFibonacciElements(a);
			
	}
	
}
