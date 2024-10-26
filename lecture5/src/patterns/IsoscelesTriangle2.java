package patterns;

import java.util.Scanner;

public class IsoscelesTriangle2 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
	
		while(i<=n){
			int p=i;
			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				j++;
			}

			j=1;
			
			while(j<=i){
				System.out.print(p);
				j++;
				p++;
			}

			j=1;
			while(j<i){
				System.out.print(p-j-1);
				j++;
				//p--;
			}
			System.out.println();
			i++;
		}
	}

}
