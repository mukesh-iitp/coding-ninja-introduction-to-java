package lecture2;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	
		//String str=sc.nextLine();
		String str=sc.next();
		System.out.println(str);
		
		char c=str.charAt(0);
		System.out.println(c);
		
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		

		
		long l=sc.nextLong();
		double d=sc.nextDouble();
		float f=sc.nextFloat();
		

		
		int si=(p*r*t)/100;
		
		System.out.println(si);

	}

}
