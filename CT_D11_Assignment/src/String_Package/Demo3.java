package String_Package;

public class Demo3 {
	
	public static void charAtMethod() {
		String s = "abc";
		char ch= s.charAt(0);
		System.out.println(ch);
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
	}
	
	public static void lengthMethod() {
		String s = "abc";
		int l = s.length();
		System.out.println(l);
	}
	
	public static void uppercaseLowercaseMethod() {
		String s = "abc";
		String d = "XYZ";
		
		String upper = s.toUpperCase();
		System.out.println(upper);
		System.out.println(d.toLowerCase());
	}
	
	public static void trimMethod() {
		String s="  nan  ";
		String s1 = " abc xyz     ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s1);
		System.out.println(s1.trim());
	}
	
	public static void main(String[] args) {
		charAtMethod();
		lengthMethod();
		uppercaseLowercaseMethod();
		trimMethod();
	}

}
