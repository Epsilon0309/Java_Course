package Interface;

public interface Calculator {

	void add(int a,int b);// it is same as public abstract void add(int a,int b);
	void multi(int a,int b);
	void sub(int a,int b);
	
	public abstract void m1();
	abstract void m2();
	
	// we cna't use protected and private
//	protected abstract m3(); CTE
//	private abstract m4(); CTE
}
