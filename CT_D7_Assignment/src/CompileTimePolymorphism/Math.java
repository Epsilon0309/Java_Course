package CompileTimePolymorphism;

public class Math {

	public static void add(int a,int b) {
		System.out.println("2 int type");
		System.out.println(a+b);
	}
	public static void add(int a,int b ,int c) {
		System.out.println("3 int type");
		System.out.println(a+b+c);
	}
	public static int add(int a,int b ,int c,int d) {
		System.out.println("4 int type return");
		return (a+b+c+d);
	}
	public static void add(float a,float b) {
		System.out.println("2 float type");
		System.out.println(a+b);
	}
	public static void add(double a,double b) {
		System.out.println("2 double type");
		System.out.println(a+b);
	}
	
	public void add(float a,double b) {
		System.out.println("Non-static using object");
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		add(2,3);
		add(2.34f,3.36f);
		add(2.26d,3.2365d);
		add(2,3,5);
		int ans = add(2,3,5,4);
		System.out.println(ans);
		
		Math m = new Math();
		m.add(23.23f, 12.36);
		
	}
	
}
