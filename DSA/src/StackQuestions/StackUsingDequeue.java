package StackQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDequeue {
	
	int top=-1;
	Deque<Integer>deqeue = new ArrayDeque<Integer>();

	public int push(int data) {
		deqeue.addLast(data);
		top++;
		return data;
	}
	
	public int pop() {
		top--;
		return deqeue.pollLast();
	}

	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return deqeue.isEmpty();
	}
	
	public static void main(String[] args) {
		StackUsingDequeue s = new StackUsingDequeue();
		s.push(12);
		s.push(14);
		s.push(16);
		s.push(18);
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
	
}
