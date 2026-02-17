package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class CustomComparison {

	public static List<Integer> filterOdd(int[]arr){
		List<Integer> ans = new ArrayList<Integer>();
		for(int a:arr) {
			if(a%2==0) {
				ans.add(a);
			}
		}
		return ans;
	}
	
	public static List<Integer> filtereven(int[]arr){

		return Arrays.stream(arr).filter(value->value%2!=0).boxed().toList();
	}
	
	public static void main(String[] args) {

	}
	
}
