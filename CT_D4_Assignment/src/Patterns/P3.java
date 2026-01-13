package Patterns;

public class P3 {
	
	public static void p3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		p3(3);
	}

}
