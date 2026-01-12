package Conditional_statement;

public class BiggestOf4 {
public static void main(String[] args) {
	int a=10,b=11,c=12,d=13;
	
	//approach 1
	int big1=(a>b)?a:b;
	int big2=(c>d)?c:d;
	if(big1>big2) {
		System.out.println(big1);
	}
	if(big2>big1) {
		System.out.println(big2);
	}
	
	//approach 2
	int big=a;
	if(b>big) {
		big=b;
	}
	if(c>big) {
		big=c;
	}
	if(d>big) {
		big=d;
	}
	System.out.println("Biggest Number: "+big);
}
}
