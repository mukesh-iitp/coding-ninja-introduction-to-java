package twoDimensionalArrays;

import java.util.Scanner;

public class ColumnWiseTraversal {
	
	 public static int[] printColWise(int [][]a) {
	        // Write your code here.
	        int m=a.length;
			int n=a[0].length;
	        int arr[]=new int[m*n];

	        for(int i=0;i<a[0].length;i++)
	        {
	            for(int j=0;j<a.length;j++)
	            {
	            	arr[i*m+j]=a[j][i];
	            }
	        }
	    return arr;
	    }
	 
	 public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter the no of rows:");
			int row=sc.nextInt();
			System.out.print("Enter the no of columns: ");
			int column=sc.nextInt();
			
			int array2D[][]= new int[row][column];
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print("Enter element at "+i+" row and "+j+" column:");
					array2D[i][j]=sc.nextInt();
				}
			}
			sc.close();
			
			int arr[]=new int[row*column];
			
			arr=printColWise(array2D);
			System.out.print("The required output: ");
			System.out.print("[ ");
			for(int i=0;i<row*column;i++)
				System.out.print(+arr[i]+" ");
			System.out.print("]");
		 
		 
	}

}
