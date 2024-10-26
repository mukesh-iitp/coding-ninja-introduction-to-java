package functions;

import java.util.Scanner;

public class NCR {
	
	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++)
			ans=ans*i;
		return ans;
	}
	
	public static int ncr(int n, int r) {
		int num=factorial(n);
		int den1=factorial(r);
		int den2=factorial(n-r);
		
		int ans=num/(den1*den2);
		
		return ans;
	}
	
	public static void func1(int a,int b)
	{
	    int ans=1;
	    for(int i=0;i<b;i++)
	    {
	        ans*=a;
	    }
	    System.out.println(ans);
	}
	public static int func(int a){
	    a += 10;
	    return a;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		
		func1(2, 5);
		
		int a = 5;
		func(a);
	    System.out.println(a);
		
		int output=ncr(n, r);
		System.out.println(output);
		
	}
}
