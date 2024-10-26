package recursion;


public class CheckSortedArray {

	public static boolean checkSortedArray(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		
		boolean smallAns = checkSortedArray(smallInput);
		if(!smallAns){
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else{
			return false;
		}
		
	}
public static boolean checkSortedArray_2(int input[]){
		
		if(input.length <= 1){
			return true;
		}
		if(input[0] > input[1]){
			return false;
		}
		 
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		boolean smallAns = checkSortedArray_2(smallInput);
		return smallAns;
//		if(smallAns){
//			return true;
//		}else{
//			return false;
//		}
}

//This function checks if the array is sorted from startIndex to end
private static boolean checkSortedArrayBetter(int input[],int startIndex){
	
	if(startIndex >= input.length - 1){
		return true;
	}
	if(input[startIndex] > input[startIndex + 1]){
		return false;
	}
	boolean smallAns = checkSortedArrayBetter(input, startIndex + 1);
	return smallAns;
	
}

public static boolean checkSortedArrayBetter(int input[]) {
	
	return checkSortedArrayBetter(input, 0);
}

	public static void main(String[] args) {
		int input[] = {1,2,3,5,9,10};
		System.out.println(checkSortedArrayBetter(input));

	}
}