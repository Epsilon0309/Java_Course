package Practice;

import java.util.Arrays;

public class Waveform {

	public static int[] waveform(int[]a) {
		for(int i=0;i<a.length;i+=2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[]a = {3, 6, 5, 10, 7, 20};
		
		System.out.println(Arrays.toString(waveform(a)));
	}
	
}
