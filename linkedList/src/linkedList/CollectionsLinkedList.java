package linkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(10);
		list.add(30);
		list.addFirst(40);
		list.addLast(50);
		list.addFirst(5);
		list.set(2, 100);
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" "); 
		
	}

}
