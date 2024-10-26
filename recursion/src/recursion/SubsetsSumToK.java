package recursion;

import java.util.Scanner;

public class SubsetsSumToK {
	
	private static int[][] subsetsSumK(int[] input, int k) {
		
		return subsetsSumK(input,k, 0);
	}
	
	private static int[][] subsetsSumK(int[] input, int k, int si) {
		
		if(si==input.length)
        {
            if(k==0)
            	return new int[1][0]; //returning the blank array.
            else
                return new int[0][0];
        }
		
		int op1[][]=subsetsSumK(input,k-input[si],si+1);//including first element
		int op2[][]=subsetsSumK(input,k,si+1);//excluding the first element
		
		int output[][]=new int[op1.length+op2.length][];
		
		//keeping our subsets in output 2D array
		int l=0;
	    for(int i=0;i<op2.length;i++){
	        output[i]=new int[op2[i].length];
	        for(int j=0;j<op2[i].length;j++)
	            output[l][j]=op2[i][j];
	        l++;
	    }
	    for(int i=0;i<op1.length;i++){
	        output[i+l]=new int[op1[i].length+1];
	        output[i+l][0]=input[si];
	        for(int j=1;j<=op1[i].length;j++){
	            output[i+l][j]=op1[i][j-1];
	        }
	    }	
		return output;
	}



	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = SubsetsSumToK.subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
