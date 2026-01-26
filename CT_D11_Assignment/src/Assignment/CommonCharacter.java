package Assignment;

public class CommonCharacter {
	
	public static char[] commonCharacter(String s1,String s2) {
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		char[]ch1 = s3.toCharArray();
		char[]ch2 = s4.toCharArray();
		char[]ans1= new char[26];
		char[]ans2= new char[26];
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]>='a'&& ch1[i]<='z') {
				ans1[ch1[i]-'a']++;
			}
		}
		for(int i=0;i<ch2.length;i++) {
			if(ch2[i]>='a'&& ch2[i]<='z') {
				ans2[ch2[i]-'a']++;
			}
		}
		char[]ans=new char[26]; int a=0;
		for(int i=0;i<26;i++) {
			if(ans1[i]>=1&&ans2[i]>=1) {
				ans[a]=ans1[i];
				a++;
			}

		}
		return ans;
	}

	public static void main(String[] args) {
		String s1 = "zxcvbnm asdfghjkl pOI REWWQ['/";
		String s2 = "zxcvbnm  pOI UYT RREWWQ['/";
		char[]ans = commonCharacter(s1,s2);
		System.out.println(ans[0]);

	}

}
