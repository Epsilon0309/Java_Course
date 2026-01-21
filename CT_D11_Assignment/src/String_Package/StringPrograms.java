package String_Package;

public class StringPrograms {
	
	public static void charAtMethod() {
		String s = "abc";
		char ch= s.charAt(0);
		System.out.println("----charAtMethod---");
		System.out.println(ch);
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
	}
	
	public static void lengthMethod() {
		String s = "abc";
		int l = s.length();
		System.out.println("----lengthMethod---");
		System.out.println(l);
	}
	
	public static void uppercaseLowercaseMethod() {
		String s = "abc";
		String d = "XYZ";
		
		String upper = s.toUpperCase();
		System.out.println("----uppercaseLowercaseMethod---");
		System.out.println(upper);
		System.out.println(d.toLowerCase());
	}
	
	public static void trimMethod() {
		String s="  nan  ";
		String s1 = " abc xyz     ";
		System.out.println("----trimMethod---");
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s1);
		System.out.println(s1.trim());
	}
	
	public static void subStringMethod() {
		String s = "abcdef";
		System.out.println("----subStringMethod---");
		System.out.println(s.substring(1));//bcdef
		System.out.println(s.substring(2));//cdef
		System.out.println(s.substring(1,4));//bcd(starting from 1 and end before 4)
		System.out.println(s);
	}
	
	public static void stringToCharArray() {
		String s ="abcdef"; 
		char[]c = s.toCharArray();
		System.out.println("----stringToCharArray---");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	public static void charArrayToString() {
		char[]ch= {'a','b','c'};
		String str = new String(ch);
		System.out.println("----charArrayToString---");
		System.out.println(str);
	}
	
	public static void indexOfMethod() {
		String s = "abbcdbea";
		System.out.println("----indexOfMethod---");
		System.out.println(s.indexOf('b'));// first occurence
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf('y'));//-1 means does not exist
		System.out.println(s.indexOf('b',3)); // starts from 3 rd index
		System.out.println(s.lastIndexOf('b'));//5
		System.out.println(s.lastIndexOf('a'));//7
		
		String s2 = "hii java java hi";
		System.out.println(s2.indexOf("java"));
		System.out.println(s2.indexOf("java",5));
	}
	
	public static int alphabetOrNot(String s) {
		System.out.println("----alphabetOrNot---");
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				count++;
			}
		}
		return count;
	}
	
	public static String convertUppercaseLowercase(String s) {
		System.out.println("----convertUppercaseLowercase---");
		String ans = new String();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='a'&&c<='z')) {
				c=(char)(c-32);
			}
			else if((c>='A'&&c<='Z')) {
				c=(char)(c+32);
			}
			
			ans+=c;
			
		}
		return ans;
	}
	
	public static void containsMethod() {
		String s = "I love java";
		System.out.println("----containsMethod---");
		System.out.println(s.contains("java"));//true
		System.out.println(s.contains("python"));//false
	}
	
	public static void splitMethod() {
		String s2="hi,bye,java";
		System.out.println("----splitMethod---");
		String[]str = s2.split(",");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
	
	public static void equalsIgnoreMethod() {
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println("----equalsIgnoreMethod---");
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
	}
	
	public static void startsWithMethod() {
		String s= "helloworld";
		System.out.println("----startsWithMethod---");
		System.out.println(s.startsWith("hello"));//true
		System.out.println(s.startsWith("ell"));//false
	}
	
	public static void endsWithMethod() {
		String s= "helloworld";
		System.out.println("----endsWithMethod---");
		System.out.println(s.endsWith("hello"));//false
		System.out.println(s.endsWith("ell"));//true
	}
	
	public static void valueOfMethod() {
		int a=100;// converts int to string
		String s = null;
		s=String.valueOf(a);
		System.out.println("----valueOfMethod---");
		System.out.println(s);
	}
	
	public static void isEmptyisBlank() {
		String s=" ";
		System.out.println("----isEmptyisBlank---");
		System.out.println(s.isEmpty());//false it needs to be empty ie nothing must be there to give true
		System.out.println(s.isBlank());//true as there is nothing 
	}
	
	public static void replaceMethod() {
		String s = "hi hi bye";
		System.out.println("----replaceMethod---");
		System.out.println(s.replace("hi", "hello"));// hello hello bye
		System.out.println(s.replaceAll("hi", "hello"));// hello hello bye
		System.out.println(s.replaceFirst("hi", "hello"));// hello hi bye
	}
	
	public static void main(String[] args) {
		String s = "ABC123xyz";
		System.out.println(convertUppercaseLowercase(s));
		
		charAtMethod();
		lengthMethod();
		uppercaseLowercaseMethod();
		trimMethod();
		subStringMethod();
		stringToCharArray();
		charArrayToString();
		indexOfMethod();
		containsMethod();
		splitMethod();
		equalsIgnoreMethod();
		startsWithMethod();
		endsWithMethod();
		valueOfMethod();
		isEmptyisBlank();
		replaceMethod();
		
	}

}
