package strings;

public class StringDemo {
	public static void main(String[] args) {
		char arr[]= {'C','o','d','i','n','g'};
		String str1="Coding";
		String str="";	//empty string
		System.out.println("Array length is "+ arr.length);
		System.out.println("String length is "+str1.length());
		System.out.println("Character at index 2 of string is "+str1.charAt(2));
		System.out.println("Length of empty string is "+str.length());
		
		String str2=" is fun.";
		str1+=str2;
		System.out.println(str1);
		
		str1=str1.concat(str2);
		System.out.println(str1);
		
		System.out.println(str1.equals(str2));
		
		String s1="coding";
		String s2="coding";
		String s3="Coding";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.contains("od"));
		
		String a ="abcd";
		String b="abcda";
		System.out.println(a.compareTo(b));
		
		String c="coding",d="ninjas";
		if(c.contains("ing"))
		{
		    c+=d;
		}
		else
		{
		    d+="ing";
		}
		System.out.print(d+c);
		System.out.println();
		
		String str3="coding";
		System.out.println(str3.substring(0));
		System.out.println(str3.substring(4));
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(6));
		//System.out.println(str3.substring(7)); // java.lang.StringIndexOutOfBoundsException
		System.out.println(str3.substring(4).length());
		
		System.out.println(str3.substring(1,5));
		
		for(int i=2;i<4;i++)
		{
		    System.out.print(str3.substring(i));
		}
		
		System.out.println();
		
		for(int i=2;i<5;i++)
		{
		    System.out.print(str3.substring(i-2,i+1));
		}
	
	}	

}
