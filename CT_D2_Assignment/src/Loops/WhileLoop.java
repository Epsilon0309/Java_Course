package Loops;

public class WhileLoop {
public static void main(String[] args) {
	int n=5;int i=1;
	// 1 to N
	while(i<=n) {
		System.out.print(i);
		i++;
	}
	
	System.out.println();
	
	//N to 1
	int j = n;
	while(j>0) {
		System.out.print(j);
		j--;
	}
}
}
