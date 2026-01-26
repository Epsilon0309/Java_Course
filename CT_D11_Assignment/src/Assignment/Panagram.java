package Assignment;

public class Panagram {
	public static void checkPanagram(String s) {
		String s1 = s.toLowerCase();
		char[]ch = s1.toCharArray();
		char[]ans= new char[26];
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a'&& ch[i]<='z') {
				ans[ch[i]-'a']++;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(ans[i]==0) {
				System.out.println("Not panagram");
				return;
			}

		}
		System.out.println("Panagram");
	}

	public static void main(String[] args) {
		String s = "zxcvbnm asdfghjkl pOI UYT RREWWQ['/";
		checkPanagram(s);
	}
}
