package Assignment;

public class SpecialSymbol {

	public static void specialSymbol(String s) {
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(!((c>='0'&&c<='9')||(c>='a'&&c<='z'||c>='A'&&c<='z'))) {
				ans.append(c);
			}
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		String s = "abc23@#$gf";
		specialSymbol(s);
		
	}
	
}
