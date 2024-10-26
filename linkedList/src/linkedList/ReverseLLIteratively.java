package linkedList;

public class ReverseLLIteratively {
	
	public static Node<Integer> reverseLLIteratively(Node<Integer> head){
		
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		Node<Integer> temp;
        while(curr!=null)
        {
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		head=reverseLLIteratively(head);
        LinkedListUse.print(head);
	}

}
