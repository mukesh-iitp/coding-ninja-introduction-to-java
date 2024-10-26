package functions;

import java.util.Scanner;

public class FunctionExamples {
	
	public static boolean isPrime(int n) {
		
		int d=2;
		while(d<n) {
			if(n%d==0)
				return false;
			d++;
		}
		return true;
	}
	
	public static void print1toN(int n) {
		
		if(n<=0)
			return;
		
		for(int i=1;i<=n;i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		boolean ansPrime=isPrime(n);
		System.out.println(ansPrime);
		
		System.out.println("*****************");
		print1toN(n);
		
	}

}
