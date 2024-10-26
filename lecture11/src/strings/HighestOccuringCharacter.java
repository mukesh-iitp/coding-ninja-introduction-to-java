package strings;

public class HighestOccuringCharacter {
	
	public static char highestOccuringChar(String str) {
		int max=0;
		char maxOccuringChar='\0';
		for(int i=0;i<str.length();i++)
		{
			int counter=0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(j)==str.charAt(i))
					counter++;
			}
			if(counter>max)
			{
				max=counter;
				maxOccuringChar=str.charAt(i);
			}		
		}
		System.out.print("Total Count= "+max);
		return maxOccuringChar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdeapapqarreeeeeeeekkkkkkkdskfsdfskkk";
		char result=highestOccuringChar(str);
		System.out.print(", and letter is: ");
		System.out.print(result);
	}
}
