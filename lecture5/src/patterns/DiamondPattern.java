package patterns;

import java.util.Scanner;

public class DiamondPattern {
	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.close();
			
			int i=1;
			int m1=(n+1)/2;
			int m2=n-m1;
			
			/*while(i<=m1) {
				int j=1;
				while(j<=m1-i) {
					System.out.print(" ");
					j++;				
				}
				
				j=1;
				while(j<=(2*i-1)) {
					System.out.print("*");
					j++;
				}
				
				System.out.println();
				i++;
			}
			
			i=1;
			while(i<=m2) {
				int j=1;
				while(j<=i) {
					System.out.print(" ");
					j++;
				}
				
				j=1;
				while(j<=2*i-i) {
					System.out.print("*");
					j++;
				}
				
				System.out.println();
				i++;
			}*/
			
			int j;
				while(i<=m1)
				{
					j=1;
					while(j<=m1-i)
						{
						System.out.print(" ");
						j++;
				 		}
					
					j=1;
					while(j<=i*2-1)
				 	{
						System.out.print("*");
						j++;
				 	}
				 
					System.out.println();
					i++;
				}
				
				i=m2;
				while(i>0)
					{
					j=1;
					while(j<=m2-i+1)
				 		{
						System.out.print(" ");
						j++;
				 		} 
					
					j=1;
					while(j<=i*2-1)
				 		{
						System.out.print("*");
						j++;
				 		}
				 System.out.println();
				 i--;
				}
		
	}

}
