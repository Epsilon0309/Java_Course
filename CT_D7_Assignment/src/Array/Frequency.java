package Array;

public class Frequency {
	
	public static int frequency(int num,int[]a) {
		int ans=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				ans++;
			}
		}
		return ans;
	}
	public static void printInputInt(int []ab) {

		for(int i=0;i<ab.length;i++) {
			System.out.print(ab[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int []a= {10,7,8,10,18,10,10,1181,10};
		
		System.out.println(frequency(10,a));;

		
	}

}
