package linkedList;

import java.util.Scanner;

public class FindANode {
	
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> node = head;
		if(node==null)
			return -1;
		int indexPosition=0;
		while(node.next!=null){
			if(node.data==n)
				return indexPosition;
			else {
				node=node.next;
				indexPosition++;
				}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter lists, -1 for exit");
		Node<Integer> head=LinkedListUse.takeInput();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter node number");
		int number=sc.nextInt();
		System.out.println(findNode(head, number));
		
		sc.close();
		
	}

}
