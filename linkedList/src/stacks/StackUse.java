package stacks;

public class StackUse {
	
	public static void main(String[] args) throws StackFullException {
		
		//StackUsingArray stack=new StackUsingArray();
		StackUsingArray stack=new StackUsingArray(6);
		
		for(int i=1;i<=5;i++)
			stack.push(i);
		
		//System.out.println(stack.size());
		
		while(!stack.isEmplty()){
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				//never reach here
			}
			
		}
		
	}
		
}
