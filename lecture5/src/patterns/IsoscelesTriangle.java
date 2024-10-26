package patterns;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=n) {
			int j=1;
			int p=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;				
			}
			
			j=1;
			while(j<=i) {
				System.out.print(p);
				j++;
				p++;
			}
			
			p=i-1;
			j=1;
			while(j<=i-1) {
				System.out.print(p);
				j++;
				p--;
			}
				
			System.out.println();
			i++;
		}
	}

}
