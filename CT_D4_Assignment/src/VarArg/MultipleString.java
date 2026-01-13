package VarArg;

public class MultipleString {

	public static void concatenateString(String... s) {
		String ans="";
		for(String a:s) {
			ans+=a;
			ans+=" ";
		}
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		concatenateString("Hello","Everyone");
	}
	
	
}
