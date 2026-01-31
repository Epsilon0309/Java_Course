package Basic;


public class CustomStack {

	int[]stack;
	private int size;
	int top;
	
	public CustomStack(int size) {
		stack=new int[size];
		top=-1;
		this.size=size;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==size-1;//size.stack.length-1
	}
	
	public int push(int element) {
		if(isFull()) {
			throw  new RuntimeException("Stack overflow");
		}
		stack[++top]=element;
		return element;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack underflow");
		}
		return stack[top--];
	}

	public int size() {
		return top+1;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("nothing in stack");
		}
		return stack[top];
	}
	
	
	public static void main(String[] args) {
		
		CustomStack stack = new CustomStack(4);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		System.out.println(stack.pop());
		
		//System.out.println(stack.pop());
		System.out.println(stack.size());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		//System.out.println(stack.push(4));
		
		System.out.println(stack.peek());
		
	}
	
}

