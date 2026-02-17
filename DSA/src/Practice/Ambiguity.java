package Practice;

public class Ambiguity {
	public static void main(String[] args) {

	}
}

interface A{
	default void add() {
		System.out.println("a");
	}
}

interface B{
	default void add() {
		System.out.println("b");
	}
}

class c implements A,B{

	@Override
	public void add() {
		A.super.add();
	}
	
}