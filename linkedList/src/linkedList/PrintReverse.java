package linkedList;

public class PrintReverse {
	
	public static void printReverse(Node<Integer> root) {
		//Your code goes here
        if (root==null)
            return;
        printReverse(root.next);
        System.out.print(root.data+" ");
       
	}
    
    public static void main(String[] args){
        
        Node<Integer> head = LinkedListUse.takeInput(); 
        printReverse(head);
        LinkedListUse.print(head);
   
    }

}
