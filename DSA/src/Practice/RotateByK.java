package Practice;

import java.util.ArrayList;

public class RotateByK {

	public static ArrayList<Integer> rotateByK(ArrayList<Integer>a,int k){
		ArrayList<Integer>ans = new ArrayList<Integer>();
		
		ans.addAll(a.subList(k, a.size()));
		ans.addAll(a.subList(0, k));
		
		return ans;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer>d= new ArrayList<Integer>();
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		d.add(6);
		
		System.out.println(rotateByK(d, 3));
	}
}
