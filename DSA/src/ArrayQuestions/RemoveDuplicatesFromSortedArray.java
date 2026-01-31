package ArrayQuestions;

import java.util.ArrayList;

public class RemoveDuplicatesFromSortedArray {

	public static ArrayList<Integer> removeDuplicatesFromSortedArray(ArrayList<Integer>a){
		ArrayList<Integer>ans = new ArrayList<Integer>();
		int prevElement=-1;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)!=prevElement) {
				ans.add(a.get(i));
				prevElement=a.get(i);
			}
			else {
				prevElement=a.get(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>a=new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(4);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		
		System.out.println(removeDuplicatesFromSortedArray(a));
	}
	
}
