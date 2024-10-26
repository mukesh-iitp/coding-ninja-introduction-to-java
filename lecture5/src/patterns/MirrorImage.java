package patterns;

import java.util.Scanner;

public class MirrorImage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
		
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				//System.out.print(" ");
				System.out.print("*");
				j++;
			}
			
			j=1;
			while(j<=i) {
				//System.out.print("*");
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
