package Core_Java;

public class Ques1 {
	public static void main(String[] args) {
		// question 1
		byte a = 10;
		int b = a;// widening
		System.out.println(b);

		// question 2
		float c = 6.7f;
		int d = (int) c;// narrowing
		System.out.println(d);

		// question 3
		char e = 'A';
		int f = e;// widening
		System.out.println(f);

		// question 4
		int g = 78;
		char h = (char) g;// narrowing
		System.out.println(h);
	}
}
