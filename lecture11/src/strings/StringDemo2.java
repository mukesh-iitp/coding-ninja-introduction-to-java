package strings;

import java.util.Scanner;

public class StringDemo2 {
	
	public static void printChars(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str1,str2,str3;
		str1=sc.next();
		str2=sc.next();
		str3=sc.nextLine();
		
		sc.close();
		
		//input - Ravi is a programmer
		System.out.println(str1+" "+str1.length());
		System.out.println(str2+" "+str2.length());
		System.out.println(str3+" "+str3.length());
		
		printChars(str3);
		
	}

}
