package linkedList;

public class MergeTwoSortedLL {
	
	 public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
		
		 if(head1==null)
			 return head2;
		 if(head2==null)
		 	return head1;
	
		 //Your code goes here
		 Node<Integer> t1=head1, t2=head2;
		 Node<Integer> head=null, tail=null;
		 
		 if(t1.data<=t2.data)
		 {
			 head=t1;
			 tail=t1;
			 t1=t1.next;
		 }
		 else
		 {
			 head=t2;
			 tail=t2;
			 t2=t2.next;
		 }
		 while(t1!=null && t2!=null){
			 if(t1.data <= t2.data)
			 {
				 tail.next=t1;
				 tail=t1;
				 t1=t1.next;
			 }
			 else {
				 tail.next=t2;
				 tail=t2;
				 t2=t2.next;
			 }
		 }
		 
		 //one list is over 
		 if(t1 !=null)
		 {
			 //first list is remaining
			 tail.next=t1;
		 }
		 else
		 {
			 tail.next=t2;
		 }
		 
		 return head;
	 }
	 
	 public static void main(String[] args){
	        
	        Node<Integer> list1 = LinkedListUse.takeInput();
	        Node<Integer> list2 = LinkedListUse.takeInput();
	        
	       	Node<Integer> mergedList=mergeTwoSortedLinkedLists(list1,list2);
	       	
	       	LinkedListUse.print(mergedList);
	        
	           
	    }

}
