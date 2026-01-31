package StringQuestions;

public class FindLength {

	public void stringLength(String str) {
		char[]ch = str.toCharArray();
		System.out.println(ch.length);
	}
	
	public static void main(String[] args) {
		FindLength f =new FindLength();
		f.stringLength("ABCDE");
	}
}
