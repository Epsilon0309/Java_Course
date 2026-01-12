package Methods;

public class GratestOf3 {

	public static void greatestof3(int a, int b, int c) {
		int big = (a > b) ? a : b;
		big = (big > c) ? big : c;
		System.out.println(big);
	}

	public static void main(String[] args) {
		greatestof3(2, 4, 7);
	}

}
