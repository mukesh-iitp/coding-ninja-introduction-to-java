package recursion;

import java.util.Scanner;

public class PrintKeypadCombination {
	
	public static void printKeypad(int input) {
	
		printKeypad(input,"");
		
	}
	
	private static void printKeypad(int input, String output) {
		
		if(input==0)
        {   
			System.out.println(output);
			return;
        }
		
		String helperString=helper(input%10);
		
        printKeypad(input/10,helperString.charAt(0)+output);
        
        printKeypad(input/10,helperString.charAt(1)+output);
        
        printKeypad(input/10,helperString.charAt(2)+output);
        
        if(helperString.length()==4)
        	printKeypad(input/10,helperString.charAt(3)+output);
		
		
	}
	
	private static String helper(int n){
		if(n==2)
            return "abc";
        if(n==3)
            return "def";
        if(n==4)
            return "ghi";
        if(n==5)
            return "jkl";
        if(n==6)
            return "mno";
        if(n==7)
            return "pqrs";
        if(n==8)
            return "tuv";
        if(n==9)
            return "wxyz";
        else
            return "";
      }    



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		PrintKeypadCombination.printKeypad(input);
		
		s.close();
	}

}
