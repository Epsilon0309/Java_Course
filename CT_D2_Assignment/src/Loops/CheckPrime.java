package Loops;

public class CheckPrime {
public static void main(String[] args) {
	int num=17;
	if (num>=2 ) {
		System.out.println("Not Prime");
	}
	int count=0;
	for(int i=3;i*i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		if(count>0) {
			System.out.println("Not Prime");
			break;
		}
	}
	if (count==0) {
		System.out.println("Prime");
	}

}
}
