package arrays;

import java.util.Scanner;

public class NonPrimitiveDataType {
	public static int[] takeInput() {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int input[]=new int[size];
		for(int i=0;i<size;i++)
			input[i]=sc.nextInt();
		
		sc.close();

		return input;
	}
	
	public static void printInput(int input[]) {
		int size=input.length;
		for(int i=0;i<=size-1;i++)
			System.out.print(input[i]+" ");
		
	}
	public static void increment(int i) {
		i++;
	}
	
	public static void incrementArray(int input[]) {
		input=new int[5];
		for(int i=0;i<input.length;i++)
			input[i]++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[]=takeInput();
		//printInput(arr);
		
		//int i=10;
		//increment(i);
		//System.out.println(i);
		
		int arr[]= {1,2,3,4,5};
		incrementArray(arr);
		printInput(arr);
		
		}
	
}
