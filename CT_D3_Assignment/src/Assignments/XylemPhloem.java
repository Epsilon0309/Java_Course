package Assignments;

import java.util.Scanner;

public class XylemPhloem {
	
	public static int countDigit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static String xylemPhloem (int num) {
		int count=countDigit(num);
		int endSum=0,middleSum=0;
		for(int i=1;i<=count;i++) {
			int rem=num%10;
			if(i==1 || i==count) {
				endSum+=rem;
				num/=10;
			}
			else {
				middleSum+=rem;
				num/=10;
			}

		}
		
		if(endSum==middleSum) {
			return "Xylem";
		}
		else {
			return "Phloem";
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = sc.nextInt();
	
	System.out.println(xylemPhloem(num));
	
}
}
