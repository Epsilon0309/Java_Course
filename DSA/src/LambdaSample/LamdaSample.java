package LambdaSample;

public class LamdaSample {
	
	static {
		System.out.println("LamdaParentStatic");
	}
	
	{
		System.out.println("LamdaParentNonStatic");
	}
	
	public LamdaSample() {
		System.out.println("Parent class constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		
		LamdaSample l = new LamdaSampleChild();
	}

}

class LamdaSampleChild extends LamdaSample{
	static {
		System.out.println("LamdaChildStatic");
	}
	
	{
		System.out.println("LamdaChildNonStaic");
	}
	
	public LamdaSampleChild() {
		System.out.println("Child class constructor");
	}
}
