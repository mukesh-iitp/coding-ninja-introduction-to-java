package patterns;

import java.util.Scanner;

public class CharacterPattern2 {
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		int i=1;
		while(i<=n) {
			char startingChar=(char) ('A'+i-1);
			int j=1;
			while(j<=n) {
				 System.out.print((char)(startingChar+i-1));
				 startingChar++;
				 j++;
			}
			System.out.println();
			i++;
		}
	}

}
