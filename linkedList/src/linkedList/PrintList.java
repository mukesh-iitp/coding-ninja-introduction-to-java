package linkedList;

public class PrintList {
	
	public static void printList(Node<Integer> head){
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        
        System.out.println();
    }

}
