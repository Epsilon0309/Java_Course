package Assignment;

public class MaximumVowels {
	
	public static int vowels(String s) {
		String s1 = s.toLowerCase();
		char[]ch = s1.toCharArray();
		int count=0;
		for(char c:ch) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}
	
	public static String maximumVowel(String s) {
		String[]spl=s.split(" ");
		int count=0;int index=0;
		for(int i=0;i<spl.length;i++) {
			if(count<vowels(spl[i])) {
				count=vowels(spl[i]);
				index=i;
			}
		}
		
		return spl[index];
	}
	
	public static void main(String[] args) {
		String s= "I love programming";
		System.out.println(maximumVowel(s));
	}

}
