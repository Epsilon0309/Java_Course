package VarArg;

public class MultipleArg {

	public static void add(String s,int... n) {
		int sum = 0;
		System.out.println(n.length);
		for (int i : n) {
			sum += i;
		}
		System.out.println(s+sum);
	}

	public static void main(String[] args) {
		add("ABC");
		add("ABC",5, 10, 15);
	}
}
