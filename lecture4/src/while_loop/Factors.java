package while_loop;

import java.util.Scanner;

public class Factors {
	
	 public static void main(String[] args) {
	        // Write your code here

	        Scanner sc= new Scanner(System.in);

	        int n=sc.nextInt();
	        int i=2;
	        boolean flag=false;

	        while(i<n)
	        {
	            if(n%i==0){
	                System.out.print(i+" ");
	                flag=true;
	            }

	            i=i+1;

	        }
	        if(flag!=true)
	            System.out.println(-1);
	    }

}
