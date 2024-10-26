package if_else;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int f=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		
		sc.close();
		
			
		if(f>=t && f>=t)
			System.out.println(f);
		else if(s>=t && s>=f)
			System.out.println(s);
		else
			System.out.println(t);
		
		 int x = 15;
		    if(x <= 15){
		        System.out.print("Inside if  ");
		    }else if(x == 15){
		        System.out.print("Inside else if  ");
		    }
		    System.out.println(x);

		    
		    int var1 = 5; 
	        int var2 = 6;
	        if ((var2 = 1) == var1)
	            System.out.print(var2);
	        else 
	            System.out.print(var2 + 1);
	        
	        
	        int a=50;
	        int b=5;
	        if(a/1==b)
	        {

	            System.out.println("Hello");
	        }
	        else
	        {
	            System.out.println("Hi");
	        }
	        
	        
	        int i=0;
	        while(i<10)
	        {
	            i=i+1;
	            System.out.print(i);
	            i=i+1;
	        }
	        
	        int u=50, v=20;
	        if(u>v)
	        {
	        	if(u>100)
	        		System.out.println("Ace");
	        	if(v<100)
	        		v=50;
	        }
	        else if(a==b)
	        	System.out.println("King");
	        else
	        	System.out.println("Queen");
	        
	}

}
