package if_else;

import java.util.Scanner;

public class SumOddAndEvenDigits {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int sum_even=0;
		int sum_odd=0;
		
		while(n!=0)
		{
			int digit=n%10;
			if(digit%2==0)
				sum_even=sum_even+digit;
			if(digit%2!=0)
				sum_odd=sum_odd+digit;

			n=n/10;
		}
		System.out.print(sum_even);
		System.out.print(" ");
		System.out.print(sum_odd);
	}

}
