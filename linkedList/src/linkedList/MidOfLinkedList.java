package linkedList;

public class MidOfLinkedList {
	
    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
            return head;
        Node<Integer> slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
        
    }
    
public static void main(String[] args){
        
        Node<Integer> head = LinkedListUse.takeInput(); 
        System.out.println(midPoint(head).data);
           
    }


}
