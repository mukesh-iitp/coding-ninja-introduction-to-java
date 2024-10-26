package priorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class MinPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return -1;
		else if(o1>o2)
			return 1;
		
		return 0;
	}

}

class MaxPQComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2)
			return 1;
		else if(o1>o2)
			return -1;
		
		return 0;
	}

}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.length()<o2.length())
			return -1;
		else if(o1.length()>o2.length())
			return 1;
		
		return 0;
	}
	
}

public class MaxPriorityQueueUse {
	
	public static void main(String[] args) {
		
		//MinPQComparator minComparator= new MinPQComparator();
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>(minComparator);

		//MaxPQComparator maxComparator= new MaxPQComparator();
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>(maxComparator);
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int arr[] = {9,1,0,4,7,3};
		for(int i=0 ; i<arr.length ; i++) {
			pq.add(arr[i]);
		}
		
		while (!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
			
		}
		
		System.out.println();
		
		String str[]= {"this", "at", "a", "their", "queues"};
		
		StringLengthComparator stringComparator = new StringLengthComparator();
		
		PriorityQueue<String> stringPQ=new PriorityQueue<String>(stringComparator);
		
		for(int i=0 ; i<str.length ; i++) {
			stringPQ.add(str[i]);
		}
		
		while (!stringPQ.isEmpty()) {
			System.out.print(stringPQ.remove()+" ");
			
		}
		
	}
}
	
	

