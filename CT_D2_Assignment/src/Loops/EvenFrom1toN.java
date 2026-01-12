package Loops;

public class EvenFrom1toN {
public static void main(String[] args) {
	int n=15;
	
	// approach 1
	int i=2;
	while(i<=n) {
		System.out.print(i+" ");
		i+=2;
	}
	
	System.out.println();
	
	// approach 2
	int j=1;
	while(j<=n) {
		if(j%2==0) {
			System.out.print(j+" ");
		}
		j++;
	}
}
}
