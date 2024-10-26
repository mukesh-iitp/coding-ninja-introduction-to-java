package linkedList;

public class PalindromeLimkedList {
	
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> current=head;
		Node<Integer> previous=null;
		Node<Integer> forward=null;
		
		while(current!=null) {
			forward=current.next;
			current.next=previous;
			previous=current;
			current=forward;
		}
		
		return previous;
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		
		if(head==null || head.next==null)
			return true;
		
		//find list center
		Node<Integer> fast=head;
		Node<Integer> slow=head;
		
		while(fast.next!=null && fast.next.next !=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		
		Node<Integer> secondHead=slow.next;
		slow.next=null;
		secondHead=reverse(secondHead);
		
		//compare the two sublist now
		Node<Integer> firstSubList=secondHead;
		Node<Integer> secondSubList=head;
		
		while(firstSubList != null)
		{
			if(firstSubList.data!=secondSubList.data)
				return false;
			
			firstSubList = firstSubList.next;
			secondSubList = secondSubList.next;
			
		}
		
		//rejoining the two sublists to restore the input list to its original form
		firstSubList=head;
		secondSubList=reverse(secondHead);
		
		while(firstSubList.next !=null)
		{
			firstSubList = firstSubList.next;
		}
		
		firstSubList.next=secondSubList;
		
		return true;
		
	}
	public static void main(String[] args){

		Node<Integer> head = LinkedListUse.takeInput(); 
		System.out.println(isPalindrome(head));
	}

}
