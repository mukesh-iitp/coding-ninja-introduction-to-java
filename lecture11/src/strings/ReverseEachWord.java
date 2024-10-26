package strings;

public class ReverseEachWord {
	
	public static String reverseEachWord(String input)
	{
		String result="";
		int currentWordStart=0;
		int i=0;
				
		for(;i<=input.length()-1;i++)
		{
			if(input.charAt(i)==' ')
			{
				//Reverse Current Word
				int currentWordEnd=i-1;
				String reversedWord="";
				
				for(int j=currentWordStart;j<=currentWordEnd;j++)
				{
					
					reversedWord=input.charAt(j)+reversedWord;
				}
				//Add it to final String(result)
				result=result+reversedWord+" ";
				currentWordStart=i+1;
			}
		}
		
		int currentWordEnd=i-1;
		String reversedWord="";
		for(int j=currentWordStart;j<=currentWordEnd;j++)
		{
			reversedWord=input.charAt(j)+reversedWord;
		}
		//Add it to final String(result)
		result=result+reversedWord;
		return result;
	}
	
	public static void main(String[] args) {
		
		String str="You love the way we do coding";
		String result=reverseEachWord(str);
		System.out.println(result);		
		
	}

}
