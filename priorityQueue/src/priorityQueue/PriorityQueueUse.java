package priorityQueue;

public class PriorityQueueUse {
	public static void main(String[] args) throws PriorityQueueException {
		
		MinPriorityQueue pq=new MinPriorityQueue();
		
		int arr[]= {5,1,9,2,0};
		
		for(int i=0; i<arr.length;i++)
			pq.insert(arr[i]);
		
		while(!pq.isEmplty()) {
			System.out.print(pq.removeMin()+" ");
		}
		System.out.println();
	}

}
