package String_Package;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("xyz");
		
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		
		StringBuilder s3= new StringBuilder("xyz");
		StringBuilder s4 = new StringBuilder("abc");
		System.out.println(s3.hashCode());
		System.out.println(s4);
		
		String s5 = new String(s2);//stringbuffer to string
		StringBuffer s6 = new StringBuffer(s5);//string to stringbuffer
		
		s6.reverse();
		System.out.println(s6);
		
		s6.append(" java");
		System.out.println(s6);
		
		StringBuffer s7  =  new StringBuffer("xyz");
		s7.insert(1, " java ");
		System.out.println(s7);
		
		StringBuffer s8  =  new StringBuffer("xyzsdagadfv");
		s8.delete(1, 3);//1,2 
		System.out.println(s8);
		
		StringBuffer s9  =  new StringBuffer("xyzsda gadfv");
		s9.replace(1,3, "java");
		System.out.println(s9);
		
	}
}
