package strings;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static boolean palindromeCheck(String str) {
		boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
		if(str.charAt(i) != str.charAt(j)){
			isPalindrome = false;
			break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		boolean isPalindrome = palindromeCheck(str);
		System.out.print(isPalindrome);

	}

}
