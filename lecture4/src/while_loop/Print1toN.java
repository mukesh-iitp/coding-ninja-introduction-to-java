package while_loop;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		
		while(i<=n)
		{
			System.out.println(i);
			i=i+1;
		}
		
		sc.close();
		
		int x=5;
	    int y=5;
	    while((x=5)==y)
	    {
	        System.out.println("Hello");
	        x++;
	        y++;
	    }

	}

}
