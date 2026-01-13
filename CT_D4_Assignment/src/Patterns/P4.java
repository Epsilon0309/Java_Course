package Patterns;

public class P4 {
	public static void p4(int n) {
		for (int i = 0; i < n; i++) {
			
			for (int k = 0; k < 2*i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < n - i ; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		p4(3);
	}

}
