package QueueImpl;


public class CustomQueue {
	
	private int size;
	private int[]queue;
	private int front;
	private int rear;
	
	public CustomQueue(int size) {
		this.size=size;
		queue= new int[size];
		this.front=0;
		this.rear=-1;
	}
	
	public boolean isFull() {
		return rear==size-1;
	}
	
	public boolean isEmpty() {
		return front>rear;
	}
	
	public int enqueue(int element) {
		if(isFull()) {
			throw new RuntimeException("Queue is full.....");
		}
		queue[++rear]=element;
		return element;
	}
	
	public int deQueue() {
		if(isEmpty()){
			throw new RuntimeException("Queue is empty.....");
		}
		return queue[front++];
	}
	
	public int size() {
		return rear-front+1;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("nothing");
		}
		return queue[front];
	}
	
	public static void main(String[] args) {
		CustomQueue queue = new CustomQueue(4);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.deQueue() );
		}
		
	}
}
