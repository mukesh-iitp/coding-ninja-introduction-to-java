package linkedList;

public class ReverseLLBestRecursively {
	
	public static Node<Integer> reverseLLBestRecursively(Node<Integer> head){

		//Base case
		if(head==null || head.next==null)
			return head;
		
		Node <Integer> reverseTail=head.next;
		Node <Integer> smallHead=reverseLLBestRecursively(head.next);
		reverseTail.next=head;
		head.next=null;
		
		return smallHead;

	}

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		head=reverseLLBestRecursively(head);
        LinkedListUse.print(head);
	}
}
