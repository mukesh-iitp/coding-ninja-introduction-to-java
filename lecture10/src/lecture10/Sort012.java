/*
 * Sort 0 1 2

You are given an integer array containing only 0s, 1s and 2s. Write a solution to sort this array using one scan only.
You need to change in the given array itself. So no need to return or print anything.
Input format :

Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)

Output Format :

Updated array elements (separated by space)

Constraints :
1 <= n <= 10^6
Sample Input:

7
0 1 2 0 2 0 1

Sample Output:

0 0 0 1 1 2 2 

_______________________________________________________________________________________________________________


 */

package lecture10;

import java.util.Scanner;

public class Sort012 {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
}

	public static void sort012(int[] arr){
		/* Your class should be named Sort012
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		int n1 = 0,n2 = 0,n3 = 0,i,j;
	for(i = 0;i < arr.length;i++) {
		if(arr[i] == 0)
			n1++;
		if(arr[i] == 1)
			n2++;
		if(arr[i] == 2)
			n3++;	
	}   
	    i = 0;
	    j = 0;
		while(j < n1) {
			arr[i] = 0;
			i++;
			j++;
		}
		j = 0;
		while(j < n2) {
			arr[i] = 1;
			i++;
			j++;
		}
		j = 0;
		while(j < n3) {
		    arr[i] = 2;
		    i++;
		    j++;
		}
	}

	public static void main(String[] args) {
       int[] arr = takeInput();
       sort012(arr);
       printArray(arr);
	}
	

}
