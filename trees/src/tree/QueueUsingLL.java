package tree;

public class QueueUsingLL<T> {
	
	//Data members
	private Node<T> front;
	private Node<T> rear;
	private int size;
	
	
	public QueueUsingLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	int size() {
		return size;
	}
	
	boolean isEmpty() {
		return size==0;
	}
	
	protected T front() throws QueueEmptyException {
		if(size==0)
			throw new QueueEmptyException();
		
		return front.data;
	}
	
	protected void enqueue(T value){
		Node<T> newNode=new Node<>(value);
        if (front==null)
        {
            front=newNode;
            rear=newNode;
        }
        else
        {
            rear.next=newNode;
            rear=newNode;
        }
        size++;
		
	}
	
	protected T dequeue() throws QueueEmptyException {
		
		if(size==0)
			throw new QueueEmptyException();

		T temp=front.data;
		front=front.next;
		if(size==1)
			rear=null;
		size--;
		
		return temp;    
	}
	

}
