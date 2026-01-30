package Basic;

public class CountOfFactors {
	
	public static int countFactors(int a) {
		int count=0;
		for(int i=1;i*i<=a;i++) {
			if(a%i==0) {
				count+=2;
			}
		}
		return count;

	}
	
	public void hello() {
		class Hello{
			
		}
	}
	
	public CountOfFactors() {
		interface abc{
			
		}
	}

	public static void main(String[] args) {
		System.out.println(countFactors(24));
	}
	
}
