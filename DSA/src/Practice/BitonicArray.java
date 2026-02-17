package Practice;

public class BitonicArray {
	
	public static int bitonicPeek(int[]a) {

		int start=0;int end=a.length-1;
		while(start<end) {
			int mid = (start+end)/2;
			
			if(a[mid]>=a[start]) {
				start=mid;
			}
			else {
				end=mid-1;
			}
			
		}
		
		int result=a[end];
		return result;
	}
	
	
	public static void main(String[] args) {
		int[]a = {1,3,8,12,4,2};
		System.out.println(bitonicPeek(a));
	}

}
