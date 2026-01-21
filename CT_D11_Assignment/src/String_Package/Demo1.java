package String_Package;

public class Demo1 {

	public static void main(String[] args) {
		
		String s1= new String("xyz");
		String s2 = "abc";
		String s3 = "xyz";
		String s4= new String("xyz");
		String s5= new String("abc");
		String s6 = "abc";
		
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s3);//false
		System.out.println(s4.equals(s5));//false
		System.out.println(s4==s5);//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s4);//false
		System.out.println(s2.equals(s6));//true
		System.out.println(s2==s6);//true2
	}
	
}
