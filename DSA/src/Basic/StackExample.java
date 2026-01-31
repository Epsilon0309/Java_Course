package Basic;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer>s =new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(10);
		s.push(20);
		s.push(30);
		
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.size());
		
		System.out.println("=================");
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println("======For each===========");
		for(Integer a:s) {
			System.out.println(a);
		}
		System.out.println("=================");
		System.out.println(s.pop());
		System.out.println("=================");
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
		System.out.println(s.pop());//empty stack exception
		
	}
	
	
}
