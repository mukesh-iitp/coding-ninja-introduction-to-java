package stacks;

import java.util.Stack;

public class BalancedParanthesis {
	
	public static boolean isBalanced(String expression) {
        //Your code goes here
        
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<expression.length();i++)
        {
        	if(expression.charAt(i)=='(')
        		stack.push(expression.charAt(i));
        	else if(expression.charAt(i)==')')
        	{
        		if(stack.isEmpty())
        			return false;
        		
        		char topChar= stack.peek();
        		stack.pop();
        		
        		if(expression.charAt(i)==')' && topChar=='(')
        			continue;
        		
        		else 
        			return false;
        		
        	}

        }

        return stack.isEmpty();
    }
	
}
