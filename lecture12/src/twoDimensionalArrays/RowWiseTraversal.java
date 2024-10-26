package twoDimensionalArrays;

import java.util.Scanner;

public class RowWiseTraversal {
	
	public static int[] printRowWise(int [][]a) {

		int m=a.length;
		int n=a[0].length;
        int arr[]=new int[m*n];
        //int arrayIndex=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                //arr[arrayIndex]=a[i][j];
                //arrayIndex+=1;
            	arr[i*m+j]=a[i][j];
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
		
		arr=printRowWise(array2D);
		System.out.print("The required output: ");
		System.out.print("[ ");
		for(int i=0;i<row*column;i++)
			System.out.print(+arr[i]+" ");
		System.out.print("]");
		
		
	}

}
