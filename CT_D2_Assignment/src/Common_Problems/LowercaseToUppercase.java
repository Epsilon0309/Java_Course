package Common_Problems;

public class LowercaseToUppercase {
		public static void main(String[] args) {
			char ch = 'M';
			int ascii = ch - 'a' + 'A';
			char ans = (char) ascii;
			System.out.println(ans);
		}

}
