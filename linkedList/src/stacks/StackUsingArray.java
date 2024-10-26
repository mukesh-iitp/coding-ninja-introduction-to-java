package stacks;

public class StackUsingArray {
	
	private int data[];
	private int top; //is the index of topmost element in stack
	
	public StackUsingArray() {
		data=new int[10];
		top= -1;
	}
	
	public StackUsingArray(int capacity) {
		data=new int[capacity];
		top= -1;
	}	
	
	public boolean isEmplty() {
		return (top == -1);
	}
	
	public int size() {
		return top+1;
	}
	
	public int top() throws StackEmptyException {
		if(size()==0) {
			//stack empty exception
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}

	public void push(int element) throws StackFullException {
		
		if(size()==data.length) {
//			//stack full 
//			StackFullException e=new StackFullException();
//			throw e;
			doubleCapacity();
		}
		top++;
		data[top]=element;
	}

	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0; i <= top; i++){
			data[i] = temp[i];
		}
		
	}

	public int pop() throws StackEmptyException {
		if(size()==0) {
			//stack empty exception
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		
		int temp=data[top];
		top--;
		return temp;
	}
	
}
