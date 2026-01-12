package Assignments;

public class GoodorBad {
	public static String isGoodorBad (int num) {
		int original= num;
		int ans=0;
		while(num>0) {
			int rem=num%10;
			ans=(ans*10)+rem;
			num/=10;
		}
		
		if(original==ans) {
			return "Good";
		}
		else {
			return "Bad";
		}
	}
	public static void main(String[] args) {
		int num=12345321;
		System.out.println(isGoodorBad(num));
	}
}
