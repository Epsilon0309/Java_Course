package MethodsWithReturnType;

public class Addition {
	
	public static int addition(int a,int b) {
		int res= a+b;
		return res;
	}
	
public static void main(String[] args) {
	int add = addition(3,4);
	System.out.println(add);
	System.out.println(addition(2,3));
}
}
