package WrapperClass;

public class Driverr {
	
	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer i = Integer.valueOf("123");//string->wrapper class
		System.out.println(i+1);
		
		Boolean b1= Boolean.valueOf("true");// true or TRUE gives true
		System.out.println(b1);
		Boolean b2= Boolean.valueOf("tre");// otherwise false
		System.out.println(b2);
		
		int a = Integer.parseInt("123");//string->int
		long l = Long.parseLong("243232");//string->long
		
		//int b = Integer.parseInt("123a"); // java.lang.NumberFormatException as there is character which can't be changed
		//System.out.println(b);
		
		String s = Integer.toString(123);//integer->string
		String s1 = Integer.toString(a);//integer->string
		System.out.println(s);
		System.out.println(s1);
	}
	
	void m1() {
		int n=10;
		Integer i=n; // auto boxing
		int n2 = i; //auto unboxing
		
		Integer i1 = 80;//auto boxing
		
		Character c1 = 'A';
		System.out.println(i1);
		System.out.println(c1);
	}

}
