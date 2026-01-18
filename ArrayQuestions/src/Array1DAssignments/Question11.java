package Array1DAssignments;

public class Question11 {
	
	public static int frequencyOfElement(int ele,int[]a) {
		int freq=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				freq++;
			}
		}
		return freq;
	}
	
	public static void print(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,4,6,5,4,3,8};
		System.out.println(frequencyOfElement(5,a));
	}

}
