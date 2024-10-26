package linkedList;

public class ReverseLLBetterRecursively {
	
	public static DoubleNode reverseLLBetterRecursively(Node<Integer> head){
		
		//base case
		if(head==null || head.next==null) {
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		
		DoubleNode smallAns=reverseLLBetterRecursively(head.next);
		smallAns.tail.next=head;
		head.next=null;
		
		DoubleNode ans=new DoubleNode();
		ans.head=smallAns.head;
		ans.tail=head;
				
		return ans;
	}
	
	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takeInput();
		DoubleNode ans=reverseLLBetterRecursively(head);
        LinkedListUse.print(ans.head);
      
	}

}
