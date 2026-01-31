package ArrayQuestions;

import java.util.ArrayList;

public class LeftRotateByDElements {
	
	public static ArrayList<Integer> leftRotatebyD(ArrayList<Integer>a,int d){
		ArrayList<Integer>ans = new ArrayList<Integer>();
		int size= a.size();
		ans.addAll(a.subList(d, size));
		ans.addAll(a.subList(0, d));
		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer>arr = new ArrayList<Integer>();
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);arr.add(5);
		System.out.println(arr);
		
		System.out.println(leftRotatebyD(arr, 2));
		
	}
}
