package ColleectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add(10);
		l.add("hero");
		l.add("hero");
		l.add(null);
		l.add(true);
		l.add(10);
		l.add(100);
		
		System.out.println(l);
	}
	
}
