package Basic;

public class SumOfGp {
	
	public static double sumOFGp(int start,int factor,int number) {
		double ans=(((Math.pow(factor, number)-1)*start)/(factor-1));
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(sumOFGp(5, 2, 10));
	}
	
}
