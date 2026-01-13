package Patterns;

public class P2 {

	public static void p2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		p2(3);
	}

}
