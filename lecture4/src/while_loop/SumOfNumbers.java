package while_loop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
		int sum=0;
		
		while(i<=n)
		{
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
		
		System.out.println("*****************************");
		
		int j=1;
		while(j<5)
		   {
		       System.out.print(2*j);
		       j=j+1;
		   }
		
		System.out.println("*****************************");
		
		 int k=2;
		   while(k<10)
		   {
		       System.out.print(k);
		       k=k+2;
		   }
		   
		   System.out.println("*****************************");
		   int l=2;
		   while(l<10)
		   {
		       System.out.print(l);
		       l*=2;
		   }
		   
		   System.out.println("*****************************");
		   int m=10;
		   while(m>0)
		   {
		       if(m%2==0)
		       {
		           System.out.print(10-m);
		       }
		       m--;
		   } 
		   

	}

}
