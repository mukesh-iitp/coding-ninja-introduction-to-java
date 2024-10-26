/*
 * Greatest Common Divisor
Send Feedback
You are given two numbers, ‘X’ and ‘Y’. Your task is to find the greatest common divisor of the given two numbers.
The Greatest Common Divisor of any two integers is the largest number that divides both integers.
For Example:
You are given ‘X’ as 20 and ‘Y’ as 15. The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.
Input Format:
The first line of input contains ‘T’, representing the number of test cases. 

The first line of each test case contains two space-separated integers, ‘X’ and ‘Y’, representing the given numbers.
Output Format:
For each test case, print a single integer representing the Greatest Common Divisor of ‘X’ and ‘Y’.

Print a separate line for each test case.
 */
package Test1;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		

		for(int i=1;i<=N;i++){

			int num1=sc.nextInt();
			int num2=sc.nextInt();
			int gcd=0;

			if(num1<num2)
				gcd=num1;
			else
				gcd=num2;

			for(int j=gcd;j>1;j--)
			{
				if(num1%j==0 && num2%j==0)
				{
					gcd=j;
					break;
				}
				else{
					gcd=1;
					
				}

			}
			System.out.println(gcd);
			sc.close();
		}
		
	}

}
