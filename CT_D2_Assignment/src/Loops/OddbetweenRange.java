package Loops;

public class OddbetweenRange {
	public static void main(String[] args) {
		int N1 = 20;
		int N2 = 50;
		// approach 1
		int i = N1;
		while (i <= N2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
	}
}
