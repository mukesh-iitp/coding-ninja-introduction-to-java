package recursion;

import java.util.Scanner;

public class KeypadCombination {
	
	public static String[] keypad(int n){
		//base
		if(n==0)
		{
			String s[]={""};
			return s;
		}
			
		//getting small answer recursively
		String smallAns[]=keypad(n/10);
		
		//getting string from of remaining digit
		String helpAns=helper(n%10);
		
		//storing the complete answer.
		String ans[]=new String[helpAns.length()*smallAns.length];		
		
		int k=0;
        for(int i=0;i<smallAns.length;i++){
            for(int j=0;j<helpAns.length();j++){
            ans[k]=smallAns[i]+helpAns.charAt(j);
            k++;
            }
        }
        return ans;
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
		String output[] = KeypadCombination.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
		
		s.close();
	}
	
}
