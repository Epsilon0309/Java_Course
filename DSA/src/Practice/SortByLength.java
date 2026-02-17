package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortByLength {
	
	public static ArrayList<String> answer (ArrayList<String>a){
		Collections.sort(a,(a1,a2)->a1.length()-a2.length());
		return a;
	}

	public static void main(String[] args) {
		ArrayList<String>d= new ArrayList<String>();
		d.add("abcdef");
		d.add("abcd");
		d.add("abcde");
		d.add("ab");
		d.add("abc");
		d.add("a");
		
		System.out.println(answer(d));
	}
	
}
