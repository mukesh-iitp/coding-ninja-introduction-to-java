package linkedList;

public class ReverseLLRecursively {
	public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null)
			return head;
		
		Node<Integer> finalHead=reverseRec(head.next);
		Node<Integer> temp=finalHead;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		
		temp.next=head;
		head.next=null;
		
		return finalHead;
	}
		
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		head=reverseRec(head);
        LinkedListUse.print(head);
	}

}
