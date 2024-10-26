package strings;

public class CompressTheString {
	
	public static String getCompressedString(String str) {
		// Write your code here.
		/*
		String result="";
		int count=1;
		
		char firstChar=str.charAt(1);
		result=String.valueOf(firstChar);

		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==firstChar)
			{
				count+=1;	
			}
			if(str.charAt(i)!=firstChar)
			{
				if(count==1)
					result=result+str.charAt(i);
				else
					result=result+count+str.charAt(i);
				count=1;
				firstChar=str.charAt(i);
			}
		}
		result=result+count;
		return result;
		*/
		int count = 1;
        
        StringBuffer output = new StringBuffer("");
        
        int i = 0; 
        while(i<str.length()-1){
            if(str.charAt(i+1) == str.charAt(i))
			{
                count++;
                i++;
            }
            else{
                output.append(str.charAt(i));
                if(count>1){
                	output.append(count);
            	}
                count = 1;
                i++;
            } 
        }
        output.append(str.charAt(i));
                if(count>1)
				{
                	output.append(count);
            	}
        return output.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaabbcddeeeeefffffffffffffffffffff";
		String result=getCompressedString(str);
		System.out.print("The compressed string is: ");
		System.out.print(result);
	}
}
