package linkedList;

public class KReverse {
	
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		
		if(head==null)// || head.next==null || k<1)
			return head;
		if(head.next==null)
			return head;
		if(k==0 || k==1)
			return head;
		
		Node<Integer> prev=null, current=head, next=null;
		int count=0;
		
		while(count<k && current!=null) {
			
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
			count++;	
		}
		
		if(next!=null)
			head.next=kReverse(next, k);
		
		return prev;
	}
	
	public static void main(String[] args) throws Exception {
		
		int t = Integer.parseInt(TakeInput.br.readLine().trim());

        while (t > 0) {
            
            Node<Integer> head = TakeInput.takeInput();
            int k = Integer.parseInt(TakeInput.br.readLine().trim());

            Node<Integer> newHead = KReverse.kReverse(head, k);
            PrintList.printList(newHead);
            
            t -= 1;
        }
		
	}

}
