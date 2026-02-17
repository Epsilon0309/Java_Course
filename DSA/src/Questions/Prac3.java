package Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Prac3 {
	public static void main(String[] args) {
		int size = 3;
		int[] numbers1 = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+size+" nuber of the array");
		for(int i=0;i<size;i++) {
			numbers1[i]=sc.nextInt();
		}
		int[] numbers2 = new int[size];
		System.out.println("Enter "+size+" nuber of the array");
		for(int i=0;i<size;i++) {
			numbers2[i]=sc.nextInt();
		}
		Arrays.sort(numbers1);
		Arrays.sort(numbers2);
		int i=1; boolean ans=false;
		while(i<size) {
			if(numbers1[i-1]<numbers2[i] && numbers1[i]>numbers2[i]) {
				ans= true;
			}
			else {
				ans= false;
				System.out.println(ans);
				return;
			}
			i++;
		}
		System.out.println(ans);
		sc.close();
	}
}
