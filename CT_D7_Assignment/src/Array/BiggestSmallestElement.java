package Array;

public class BiggestSmallestElement {

	public static void biggestElement(int[]a) {
		int largest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		
		System.out.println("Largest: "+largest);
	}
	
	public static void smallestElement(int[]a) {
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		
		System.out.println("Smallest: "+smallest);
	}
	
	//public static int[] bigSmall
	
	public static void main(String[] args) {
		int[]a= {10,5,7,6,8,10,20,8};
		biggestElement(a);
		smallestElement(a);
	}
	
}
