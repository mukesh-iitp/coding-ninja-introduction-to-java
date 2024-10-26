package recursion;

import java.util.Scanner;

public class BinarySearch_new {
	
	public static int search(int []nums, int target) {
        // Write your code here.
        return binarySearch(nums, 0 , nums.length-1 , target);

    }

    private static int binarySearch(int[] nums, int startIndex, int endIndex, int target){

        if(startIndex>endIndex)
            return -1;
        
        int midIndex=startIndex+(endIndex-startIndex)/2;

        if(nums[midIndex]==target)
            return midIndex;

        else if(nums[midIndex]<target)
            return binarySearch(nums, midIndex+1, endIndex, target);

        else
            return binarySearch(nums, startIndex, midIndex-1, target);

    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int x = s.nextInt();
        int result = BinarySearch_new.search(arr, x);
        System.out.print(result);
        
        s.close();
    }

}
