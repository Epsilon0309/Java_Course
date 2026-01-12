package Loops;

public class CountZeros {
public static void main(String[] args) {
	int num=12000345;
	int zeros=0;
	while(num>0) {
		int rem=num%10;
		if(rem==0) {
			zeros++;
		}
		num/=10;
	}
	System.out.println(zeros);
}
}
