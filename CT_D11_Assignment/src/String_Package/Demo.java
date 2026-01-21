package String_Package;

public class Demo {
public static void main(String[] args) {
	String a = "xyz";
	String b = "xyz";
	String c = "abc";
	
	System.out.println(a);
	System.out.println(a.toString());
	System.out.println(a.getClass());
	System.out.println(b.equals(a));
	System.out.println(b.equals(c));
	System.out.println(b.hashCode());
	System.out.println(c.hashCode());
}

}
