package MethodsWithReturnType;

public class CountDigits {
public static void main(String[] args) {
	int ans = countDigit(1234567);
	System.out.println(ans);
}

public static int countDigit(int i) {
	int ans =0;
	while(i>0) {
		ans++;
		i/=10;
	}
	return ans;
}
}
