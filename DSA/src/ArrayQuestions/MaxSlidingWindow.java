package ArrayQuestions;

import java.util.ArrayList;

public class MaxSlidingWindow {
	
	public static ArrayList<Integer> maxSlidingWindow(int[]a,int k){
		ArrayList<Integer>ans= new ArrayList<Integer>();
		for(int i=0;i<=a.length-k;i++) {
			int max= Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++) {
				if(a[j]>max) {
					max=a[j];
				}
			}
			ans.add(max);
		}
		return ans;
	}

	public static void main(String[] args) {
		int []arr = {-1,1,3,4,-2,4,6,8};
		int k=3;
		
		System.out.println(maxSlidingWindow(arr,k));
	}
	
}
