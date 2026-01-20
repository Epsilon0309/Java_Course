package p2;

import p1.C11;

public class C22 extends C11 {
	public C22() {
		super();
	}

	public static void main(String[] args) {
		C11 c1 = new C22();
		System.out.println(c1.s);
		C22 c2 = new C22();
		System.out.println(c2.s);
	}
}
