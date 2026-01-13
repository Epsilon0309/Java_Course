package Typecasting;

public class Typecassting {
	public static void main(String[] args) {
		// narrowing examples
		// eg1: float->byte
		float a = 129.4567f;
		byte b = (byte) a;
		System.out.println(b);

		// eg2: long->short
		long c = 32900l;
		short d = (short) c;
		System.out.println(d);

		// widening examples
		// eg1: float->double
		float e = 123.23f;
		double f = e;
		System.out.println(f);

		// eg2: short->float
		short g = 3214;
		float h = g;
		System.out.println(h);

	}
}
