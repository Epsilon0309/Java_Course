package Loops;

public class DoWhile {
public static void main(String[] args) {
	int n=3;
	int i=1;
	//1 to n
	do {
		System.out.print(i+" ");
		i++;
	}
	while(i<=n);
	
	System.out.println();
	
	// n to 1
	int j=n;
	do {
		System.out.print(j+" ");
		j--;
	}
	while(j>=1);
}
}
