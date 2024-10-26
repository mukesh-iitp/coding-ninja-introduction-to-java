package patterns;

import java.util.Scanner;

public class OddSquarePattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();

		int i=1;
		while(i<=n)	// Iterate through the rows
		{
			int j=1;
			int printNum=2*i-1;
			while(j<=n)	//prints the current row
			{
				System.out.print(printNum);
				printNum=printNum+2;
				if (printNum>2*n-1)
				{
					printNum=1;			//reset of the num reaching to max
				}
					
				j++;

			}
			System.out.println();
			i++;
		}
		
	}

}
