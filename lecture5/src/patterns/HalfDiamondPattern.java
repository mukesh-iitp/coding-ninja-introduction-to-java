package patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        int i,j;
        
        System.out.println("*");
        i=0;
        while(i<=n-1){
            System.out.print("*");

            j=1;
            while(j<=i){
                System.out.print(j);               
                j++;
            }
             while(j>0){
                System.out.print(j);               
                j--;
            }

            System.out.print("*");
            System.out.println();
            i++;
        }
       
        while(i>1){
            System.out.print("*");

            j=1;
            while(j<i-1){
                System.out.print(j);               
                j++;
            }
            while(j>0){
                System.out.print(j);               
                j--;
            }

            System.out.print("*");
            System.out.println();
            i--;
        }
        System.out.print("*");
	}

}
