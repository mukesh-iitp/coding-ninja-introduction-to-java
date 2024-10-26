package linkedList;

public class DeleteNodeRecursively {
	
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
    	//Your code goes here
          if (head == null)
        {
            return head;
        }
        
        if (pos==0)
        {
            head=head.next;
            return head;
        }
        else
        {
            Node<Integer> smallerHead=deleteNodeRec(head.next,pos-1);
            head.next=smallerHead;
            return head;
        }  
	}
	public static void main(String[] args) {
		

		Node<Integer> head=LinkedListUse.takeInput();	
	
		deleteNodeRec(head,2);
	
		LinkedListUse.print(head);
		
		
	}

}
