package lecture7;

import java.util.Scanner;

public class PrintNPrimeNos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i = 2; i <= n; i++)
		{
			boolean isPrime=true;
			for(int d=2;d<=i/2;d++)
			{
			if(i==2)
				System.out.println(i);
			else if(i%d==0){
				isPrime=false;
				break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}

}
