package Assignment;

public class RemoveDigits {
	
	public static String removeDigits(String s) {

		String ans = new String();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0'&&c<='9') {
				continue;
			}
			
			ans+=c;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String a = "abc123xyz";
		System.out.println(removeDigits(a));
	}

}
