package QueueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class ToDoApplication {

	public static void main(String[] args) {
		Queue<String>toDo = new LinkedList<String>();
		toDo.add("Wake Up");
		toDo.add("Drink Water");
		toDo.add("Get Shower");
		toDo.add("Get ready");
		toDo.add("Go to the college");
		toDo.add("Come back");
		toDo.add("Eat");
		toDo.add("Sleep");
		
		while(!toDo.isEmpty()) {
			System.out.println(toDo.poll()+ " completed.");
		}
	}
	
}
