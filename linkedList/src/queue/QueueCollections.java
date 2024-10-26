package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollections {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//queue.add(10);
		queue.add(20);
		
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		
		for(int i=1;i<5;i++)
		{
			queue.add(10+i);
		}
		System.out.print(queue.poll()+" "+queue.size());
		
	}

}
