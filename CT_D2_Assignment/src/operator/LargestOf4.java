package operator;

public class LargestOf4 {
public static void main(String[] args) {
	int a=10,b=15,c=200,d=25;
	//approach 1
	int res = ((a>b && a>c)?((a>d)?a:d):((b>c)?((b>d)?b:d):((c>d)?c:d)));
	System.out.println("Biggest Number is : "+res);
	//approach 2
	int big=(a>b)?a:b;
	big=(big>c)?big:c;
	big = (big>d)?big:d;
	System.out.println("Biggest Number is : "+big);
	
}
}
