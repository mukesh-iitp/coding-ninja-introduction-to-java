package linkedList;

public class EliminateDuplicates {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> h1=head,h2=head.next;
        Node<Integer> finalhead=head;
        while(h2!=null){
            if(h1.data.equals(h2.data))
            {
                h2=h2.next; 
            }
            else{
                h1.next=h2;
                h1=h2;
            }
        }
        h1.next=null;
        return finalhead;
	}
	
	public static void main(String[] args){
            
            Node<Integer> head = LinkedListUse.takeInput(); 
            head = EliminateDuplicates.removeDuplicates(head);
            LinkedListUse.print(head);
       
        }

}
