package operator;

public class GreatestOfThree {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		//approach 1
		String res = (a > b) ? ((a > c) ? "A is the greatest" : "C is the greatest")
				: ((b > c) ? "B is the greatest" : "C is the greatest");
		
		//approach 2
		String res1 = (a>b && a>c)?"A":((b>c)?"B":"C");
		
		//approach 3
		int big=(a>b)?a:b;
		big=(big>c)?big:c;
		
		System.out.println(res);
		System.out.println(res1);
		System.out.println("Biggest Number is : "+big);
		
	}
}
