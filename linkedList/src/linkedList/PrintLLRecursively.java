package linkedList;

public class PrintLLRecursively {
	
	public static void printLLRecursively(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printLLRecursively(head.next);
	}
	
	public static void printLLReverse(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		
		printLLReverse(head.next);
		System.out.print(head.data+" ");

	}
	
	public static void main(String[] args) {
		
		Node<Integer> head=LinkedListUse.takeInput();
		
		printLLRecursively(head);
		System.out.println();
		
		printLLReverse(head);
		
	}

}
