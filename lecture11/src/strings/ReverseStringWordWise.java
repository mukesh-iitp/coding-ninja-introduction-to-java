package strings;

public class ReverseStringWordWise {
	
	public static String reverseWordWise(String input) {
		// Write your code here
		String result="";
		int i;
		int wordEnd=input.length();
		for( i=input.length()-1;i>=0;i--)
		{
			if(input.charAt(i)==' ')
			{
				result=result+input.substring(i+1,wordEnd)+" ";
				wordEnd=i;
			}
		}
		result=result+input.substring(i+1,wordEnd);
		return result;

	}
	
	public static void main(String[] args) {
		
		String str="You love the way we do coding";
		String result=reverseWordWise(str);
		System.out.println(result);
		
		
	}

}
