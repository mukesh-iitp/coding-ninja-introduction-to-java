package strings;

public class ReverseString {
	
	public static String reverseString1(String str) {
		String reverseString="";
		for(int i=str.length()-1;i>=0;i--) {
			reverseString+=str.charAt(i);
		}
		return reverseString;
	}
	
	//Another approach
	public static String reverseString2(String str) {
		String reverseString="";
		for(int i=0; i<str.length();i++) {
			reverseString=str.charAt(i)+reverseString;
		}
		return reverseString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Coding";

		System.out.println(reverseString1(str));
		System.out.println();
		System.out.println(reverseString2(str));

	}

}
