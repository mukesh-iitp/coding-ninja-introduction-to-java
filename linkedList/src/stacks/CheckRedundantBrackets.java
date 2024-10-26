package stacks;

import java.util.Stack;

public class CheckRedundantBrackets {
	
	public static boolean checkRedundantBrackets(String expression) {
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0; i <expression.length(); i++) {
			
			if(expression.charAt(i) == '(' || find(expression.charAt(i)))
				stack.push(expression.charAt(i));
			
			else if(expression.charAt(i)==')')
			{
				boolean hasOperator=false;
				
				while(!stack.isEmpty() && stack.peek() !='(')
				{
					stack.pop();
					hasOperator=true;
				}
				if(!hasOperator)
					return true;
				
				if(!stack.isEmpty())
					stack.pop();
			}
			
		}
		
		return false;
	}

	private static boolean find(char ch) {

		if(ch =='+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		
		return false;
	}
	
	

}
