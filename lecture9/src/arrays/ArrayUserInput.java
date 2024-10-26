package arrays;

import java.util.Scanner;

public class ArrayUserInput {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int input[]=new int[size];
		for(int i=0;i<size;i++)
			input[i]=sc.nextInt();
		
		sc.close();
		
		for(int i=0;i<=size-1;i++)
			System.out.print(input[i]+" ");

	}

}
