package arrays;

import java.util.Scanner;

public class FindLagestInArray {
		
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
		
		public static int largestInArray(int input[]) {
			int max=Integer.MIN_VALUE;
			
			for(int i=0;i<input.length;i++)
			{
				if(input[i]>max)
					max=input[i];
			}
			
			return max;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int arr[]=takeInput();
			printInput(arr);
			System.out.println();
			System.out.println(largestInArray(arr));

		}

}
