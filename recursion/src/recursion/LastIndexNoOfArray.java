package recursion;

import java.util.Scanner;

public class LastIndexNoOfArray {
	
	public static int lastIndex(int input[], int x) {

		return lastIndex(input, x, input.length-1);
	}

	public static int lastIndex(int input[], int x, int lastIndex){

		if(input.length==0  || lastIndex<=0)
		return -1;

		else if(input[lastIndex]==x)
		return lastIndex;

		return lastIndex(input, x, lastIndex-1);

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
		System.out.println(LastIndexNoOfArray.lastIndex(input, x));
	}

}
