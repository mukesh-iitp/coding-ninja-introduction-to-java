package recursion;

import java.util.Scanner;

public class FirstIndexNoOfArray {
	
	public static int firstIndex(int input[], int x) {

		return firstIndex(input, x, 0);
	}
	public static int firstIndex(int input[], int x, int startIndex){

		if(input.length==0  || startIndex>=input.length)
		return -1;

		else if(input[startIndex]==x)
		return startIndex;

		return firstIndex(input, x, startIndex+1);

	}
	
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(FirstIndexNoOfArray.firstIndex(input, x));
	}

}
