package lecture2;

import java.util.Scanner;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		boolean isALargest=(a>=b)&&(a>=c);
		System.out.println(isALargest);

		System.out.println((a>=b)||(a>=c));
		System.out.println(!(a>=b));
		
		
		sc.close();
		
	}

}
