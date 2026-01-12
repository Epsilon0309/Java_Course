package Loops;

public class CountDigits {
public static void main(String[] args) {
	int num=123; int digit=0;
	while(num>0) {
		digit++;
		num/=10;
	}
	System.out.println(digit);
}
}
