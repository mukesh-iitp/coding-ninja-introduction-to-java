package recursion;

import java.util.Scanner;

public class ReplaceCharacter {
	
	public static String replaceCharacter(String input, char c1, char c2) {
		
		if(input.length() == 0){
			return input;
		}

		String ans = "";
		if(input.charAt(0) == c1)
			ans = ans + String.valueOf(c2);
		else 
			ans=ans+input.charAt(0);
		
		String smallAns = replaceCharacter(input.substring(1),c1,c2);
		
		return ans + smallAns;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(ReplaceCharacter.replaceCharacter(input, c1, c2));
		
		s.close();
	}
	

}
