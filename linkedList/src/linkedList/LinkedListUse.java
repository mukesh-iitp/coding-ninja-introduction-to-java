package linkedList;

import java.util.Scanner;

public class LinkedListUse {
	
	public static Node<Integer> takeInput(){
		
		Node<Integer> head=null, tail=null;
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else
			{
//				Node<Integer> temp=head;
//				while (temp.next!=null) {
//					temp=temp.next;					
//				}
//				temp.next=newNode;
				tail.next=newNode;
				tail=newNode; //or tail=tail.next;
			}
			data=sc.nextInt();
			
		}
		//sc.close();
		return head;
	}
	
	public static void print(Node<Integer> head) {
		//Node<Integer> temp=head;
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
//		head=temp;
//		while(head != null){
//			System.out.print(head.data+" ");
//			head = head.next;
//		}
	}
	
	public static Node<Integer> insertNode(Node<Integer> head, int data, int position) {
		
		Node<Integer> newNode=new Node<>(data);
		
		if(position==0) {
			newNode.next=head;
			//head=newNode;
			return newNode;
		}
			
		int i=0;
		Node<Integer> temp=head;
		while (i<position-1) {
			temp=temp.next;
			i++;
			
		}
		newNode.next=temp.next;
		temp.next=newNode;
		
		return head;
		
	}
	
	public static Node<Integer> deleteNode(Node<Integer> head, int position) {
		// Write your code here.
		if(head==null )
			return head;
		if(position==0)
			return head.next;
		int nodeCount=0;
		Node<Integer> temp=head;
		while(temp!=null && nodeCount<position-1)
		{
			temp=temp.next;
			nodeCount++;
		}
		if(temp==null)
			return head;
		if(temp.next!=null)
			temp.next=temp.next.next;

		return head;
	}

	public static int length(Node<Integer> head){
		//Your code goes here
        int nodeCount=0;
        while(head != null){
        	nodeCount++;
			head = head.next;
		}
        return nodeCount;
    }
	
	public static void incrementNodes(Node<Integer> head){
		//Your code goes here
        while(head != null){
        	head.data++;
			head = head.next;
		}
    }
	
	public static void main(String[] args) {
		
		/*
		Node<Integer> node1=new Node<>(10);
		
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		Node<Integer> node2=new Node<>(20);
		node1.next=node2;
		
		System.out.println(node1.next);
		System.out.println(node2);
		*/
		
//		Node<Integer> node1=new Node<>(10);
//		Node<Integer> node2=new Node<>(20);
//		Node<Integer> node3=new Node<>(30);
//		node1.next=node2;
//		node2.next=node3;
//		
//		
//		Node<Integer> head=node1;
//		//printing the list;
//		print(head);
//		print(head);
		
		
		Node<Integer> head=takeInput();
		print(head);
		head=insertNode(head, 80, 0);
		print(head);
		head=deleteNode(head, 2);
		print(head);
		System.out.println(length(head));
		incrementNodes(head);
		print(head);
		
	}

}
