package lecture7;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean divided=false;
		for(int d=2;d<=n;d++)
		{
			if(n%d==0) {
				divided=true;
				break;
			}			
		}
		if(divided=true)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
		
		int d=2;
		while(d<n) {
			if(n%d==0)
			{
				divided=true;
				break;
			}
			d=d+1;
		}
		if(divided=true)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
		
	}

}
