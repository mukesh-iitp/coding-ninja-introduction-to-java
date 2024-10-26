/*
 * Yet another Pattern
 * 
 * Sample Input 1:
2
3
2
Sample Output 1:
***
 **     
  *

**
 *     
 */
package patterns;

import java.util.Scanner;

public class YetanotherPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();


		for(int x=1;x<=N;x++){
		int star=sc.nextInt();
		int i=1;
		while(i<=star){
			
			int j=1;
			while(j<i)
			{
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=star-i+1)
			{
				System.out.print("*");
				j++;
			}

			System.out.println();
			i++;
			}
			//System.out.println();
		}

	}

}
