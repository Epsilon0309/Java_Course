package CompileTimePolymorphism;

public class FindMax {

	public void max(int a, int b) {
		int ans = (a>b)?a:b;
		System.out.println(ans+" is maximum");
	}
	public void max(int a, int b,int c) {
		int ans = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(ans+" is maximum");
	}
	public void max(int a, float b) {
		float ans = (a>b)?a:b;
		System.out.println(ans+" is maximum");
	}
	public void max(float a, float b) {
		float ans = (a>b)?a:b;
		System.out.println(ans+" is maximum");
	}
	
	public static void main(String[] args) {
		FindMax f = new FindMax();
		
		f.max(3, 5);
		f.max(3, 5,8);
		f.max(6, 6.001f);
		f.max(5.98f, 5.99f);
	}
	
}
