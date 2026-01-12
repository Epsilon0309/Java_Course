package operator;

public class Divisible5and3 {
	public static void main(String[] args) {
		int a = 17;
		String res = ((a % 15) == 0) ? "Divisible by 3 and 5" : "Not divisible by 3 and 5";
		System.out.println(res);
	}
}
