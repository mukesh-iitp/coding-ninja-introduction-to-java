package strings;

public class StringStorage {

	public static void main(String[] args) {
		
		String str="abc";	//string is create in the string pool area inside heap memory and return the reference.
		
		String str1="abc";	//Java don't create a new string to optimize memory space.
		//Here what happens is, java look for the string abc in the string pool area.
		//If it is there exist in string pool. Then Java runtime system will only return
		//reference to the previous same string available in string pool area;
		
		String str2=new String("abc");	//This will tell system that I am not going to use string pool
		//Above statement will create an object outside the string pool. with content "abc" and 
		//its("abc") reference is get stored str2.
		
		String str3="abc";
		//this will refer to the reference of str.
		
		/*Strings in Java are Immutable*/
		
		//Immutable means once a string is created then that string is cann't be changed.
		//Change means we can't change a particular character or add any string in the string 
		//str.setCharAt(2)='z';		//error
		
		//Strings are Immutable - WHY?
		//A string in the String Pool area can have the multiple references,
		//Because of memory optimization done by java i.e. referring to same string for multiple references
		//So if change is allowed, the change will happen for all references and resulting to invalid results
		//Thats why change is string is not allowed and strings are immutable in java. 
		
		str1=str1+"def";
		System.out.println(str1);
		//str1+"def" actually doesn't make change in string that str1 is referring to.
		//What done is new string - "abcdef" is created and now str1 will referring to this string only.
		//This same like str1="abcdef". New string is created and assigned to str1
		
		
		
		
		

	}

}
