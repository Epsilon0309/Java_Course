package Operators;

public class Operators {
public static void main(String[] args) {
	// Arithmetic operator
	int a=10;
	int b=20;
	int c = a+b;
	float d = a/b;
	System.out.println(c);
	System.out.println(d);
	
	// Assignment operator
	int e=10;
	int f=20;
	e+=50;
	f%=3;
	System.out.println(e);
	System.out.println(f);
	
	// Relational operator
	System.out.println(e>=f);
	System.out.println(f!=(int)d);
	
	// concatenation
	System.out.println("abc"+"def");//abcdef
	System.out.println("abc"+123);//abc123
	System.out.println(123+"abc");//123abc
	System.out.println(12+3+"abc");//15abc
	
}
}
