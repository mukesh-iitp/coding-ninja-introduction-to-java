package strings;

public class CheckPalindrome {

	public static String reverseString(String str) {
		String reverseString="";
		for(int i=0; i<str.length();i++) {
			reverseString=str.charAt(i)+reverseString;
		}
		return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abba";
		
		if(str.equals(reverseString(str)))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}


}
