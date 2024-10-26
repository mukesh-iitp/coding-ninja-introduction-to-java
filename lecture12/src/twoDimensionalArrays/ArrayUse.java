package twoDimensionalArrays;

import java.util.Scanner;

public class ArrayUse {
	
	public static void arrayInputPrint()
	{
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
		
		System.out.println("And the matrix result is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
				System.out.print(array2D[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int arr2d[][]=new int[3][4];
		System.out.println(arr2d);
		System.out.println(arr2d[1][2]);
		arr2d[2][0]=15;
		System.out.println(arr2d[2][0]);
		//System.out.println(arr2d[3][4]); //Index 3 out of bounds for length 3
		
		System.out.println();
		
		int arr2[][]= {{1,2,3},{4,5,6}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();
		int arr[][]=new int[4][5];
	    for(int i=0;i<4;i++)
	    {
	        for(int j=0;j<5;j++)
	        {
	        	arr[i][j]=i*j;
	        	System.out.print(arr[i][j]+" ");
	        }
	        
	        System.out.println();
	    }
	    System.out.println();
	    System.out.print(arr[3][4]);
	    
	    System.out.println();
	    //arrayInputPrint();
	    
	    int[][] arr1 = new int [2][2]; 
	    for (int i = 0; i < 2; i++) { 
	        for (int j = 0; j < 2; j++) { 
	            System.out.print(arr1[i][j] + " "); 
	        } 
	    }
	    
		
	}

}
