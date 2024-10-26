package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueClassUse {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		int arr[] = {9,1,0,4,7,3};
		for(int i=0 ; i<arr.length ; i++) {
			pq.add(arr[i]);
		}
		
		//System.out.println(pq.element()); //return minimum element
		
		while (!pq.isEmpty()) {
			
			System.out.print(pq.remove()+" ");
			
		}
		
		
	}

}
