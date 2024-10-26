package linkedList;

public class InsertNodeRecursively {
	
	public static Node<Integer> insertNodeRecursively(Node<Integer> head, int position, int element){
		
		//base case
		if(position==0)
		{
			Node<Integer> newNode=new Node<>(element);
			newNode.next=head;
			
			return newNode;
		}
		
		if(head==null)
			return head;
		
		head.next=insertNodeRecursively(head.next, position-1, element);
		
		return head;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head=LinkedListUse.takeInput();
		
		insertNodeRecursively(head, 2, 10);
		
		LinkedListUse.print(head);
		
		
	}
	
}
