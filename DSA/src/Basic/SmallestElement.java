package Basic;

public class SmallestElement {
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8};
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
	}

}
