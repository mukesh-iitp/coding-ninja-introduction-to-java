package strings;

public class StringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		int arr1[]= {1,2};
		int arr2[]= {1,2};
		
		if(arr1==arr2)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		System.out.println(arr1+" "+arr2);
		*/
		
		String str1="abc";
		String str2="abc";
		//str1 & str2 both are refering to same memory because of string pool optimization.
		String str3=new String("abc");
		//if(str1==str3)	//not used generally in case of string comparisons	
		if(str1.equals(str3))	//bec actually we want to compare the string content
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		System.out.println(str1+" "+str3);
		
		String str4="abc";
		String str5="";
		System.out.println(str4.contains(str5));
		
		
	}

}
