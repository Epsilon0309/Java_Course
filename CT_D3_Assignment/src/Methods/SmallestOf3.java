package Methods;

public class SmallestOf3 {
	public static void smallestof3(int a, int b, int c) {
		//approach1
		int small = (a > b) ? b : a;
		small = (small > c) ? c : small;
		//approach2
		int smallest = (a<b && a<c)?a:((b<c)?b:c);
		
		System.out.println(small);
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		smallestof3(2, 4, 7);
	}
}
