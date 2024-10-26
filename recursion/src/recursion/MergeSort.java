package recursion;

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int[] arr, int startIndex, int lastIndex){
        // Write your code here

        if(lastIndex<=startIndex)
            return;

        int mid=(startIndex+lastIndex)/2;

        mergeSort(arr, startIndex, mid);

        mergeSort(arr, mid+1, lastIndex);

        merg(arr,startIndex,lastIndex);

    }

    private static void merg(int [] arr, int startIndex, int lastIndex)
    {
    	int mid=(startIndex+lastIndex)/2;
    	
    	int ans[]=new int[lastIndex-startIndex+1];
    	
    	int i=startIndex;
    	int j=mid+1;
    	int k=0;
    	
    	while(i<=mid & j<=lastIndex)
    	{
    		if(arr[i]<arr[j]) 
    		{
    			ans[k++]=arr[i++];
//    			ans[k]=arr[i];
//    			i++;
//        		k++;
    		}
    		else
    		{
    			ans[k++]=arr[j++];
//    			ans[k]=arr[j];
//    			j++;
//    			k++;
    		}	
    	}
    	while(i<=mid)
    	{
    		ans[k++]=arr[i++];
//    		ans[k]=arr[i];
//    		i++;
//    		k++;
    	}
    	while(j<=lastIndex)
    	{
    		ans[k++]=arr[j++];
//    		ans[k]=arr[j];
//    		k++;
//    		j++;
    	}
    	
    	for(int index=0;index<ans.length;index++)
    		arr[startIndex+index]=ans[index];
    	
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

    public static void printArray(int input[]) {
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        MergeSort.mergeSort(input, 0, input.length - 1);
        printArray(input);
        
    }
}
