package VarArg;

public class greatestDouble {
	public static double greaterElement(double...ds ) {
		double max=0;
		for(double a:ds) {
			if(max<a) {
				max=a;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		double max = greaterElement( 123.321,1256.2214,1256.222);
		System.out.println(max);
	}
	
}
