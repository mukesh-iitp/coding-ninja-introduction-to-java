package functions;

import java.util.Scanner;

public class PrintPrime {
	
	public static boolean isPrime(int n) {
		int d=2;
		while(d<n) {
			if(n%d==0)
				return false;
			d++;
		}
		return true;
	}
	
	public static void printPrime2ToN(int n) {
		
		for(int i=2;i<=n;i++) {
			//need to check if i is prime or not
			boolean isIPrime=isPrime(i);
			if(isIPrime)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		printPrime2ToN(n);

	}

}
