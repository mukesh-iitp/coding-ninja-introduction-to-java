package strings;

public class AllSubstrings {
	
	public static void printSubstring(String str) {
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1));
			}
		}

	}
	
	public static void printSubstrings(String str) {
		int n=str.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i; k<=j; k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}

	}
	public static void printSubstring2(String str) {	
		 for(int len=1;len<=str.length();len++){	//deciding length of string
	          //We have to print all strings wih length as "len"
	          for(int start=0;start<=str.length()-len;start++){
	              int end=start+len-1;
	              System.out.println(str.substring(start,end+1));
	          }
	      }

	}
	public static void main(String[] args) {
		
		String str="abc";
		printSubstring(str);
		//printSubstrings(str);
		System.out.println("*******************");
		printSubstring2(str);
		
	}

}
