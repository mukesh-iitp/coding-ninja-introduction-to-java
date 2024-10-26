package twoDimensionalArrays;

import java.util.Scanner;

public class RowWiseSum {
	
	public static void rowWiseSum(int[][] mat) {
		//Your code goes here
        
		for(int i = 0; i<mat.length; i++){
            int sum = 0;
            for(int j = 0; j<mat[0].length; j++){
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
        System.out.println();
	}
	
	public static int fun(int[][] arr2d)
	{
	    int sum=0;
	    for(int i=0;i<arr2d.length;i++)
	    {
	        for(int j=0;j<arr2d[i].length;j++)
	        {
	            sum+=arr2d[i][j];
	        }
	    }
	    return sum;
	}
	
	public static void main(String[] args) {
		
		
		int[][] arr = { {0,1,2,4,5}, {3,4,5,6,7},{5,6,7,8,9} }; 
	    System.out.println(fun(arr)); 
		
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
		
		
		rowWiseSum(array2D);
	}

}
