package maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrintIntersection {
	public static void printIntersection(int[] arr1,int[] arr2){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(arr1.length==0 || arr2.length==0)
			return ;

		HashMap<Integer,Integer> harr1=new HashMap<>();

		for(int i=0;i<arr1.length;i++)
		{   
			if(harr1.containsKey(arr1[i]))
				harr1.put(arr1[i],harr1.get(arr1[i])+1);
			else
				harr1.put(arr1[i],1);
		}

		for(int i=0;i<arr2.length;i++)
		{
			if(harr1.containsKey(arr2[i])){
				if(harr1.get(arr2[i])!=0){
					System.out.println(arr2[i]);
					harr1.put(arr2[i],harr1.get(arr2[i])-1);
				}
			}
			else
				continue;
		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int size = Integer.parseInt(br.readLine().trim());
		int[] input = new int[size];

		if (size == 0) {
			return input;
		}

		String[] strNums;
		strNums = br.readLine().split("\\s");

		for (int i = 0; i < size; ++i) {
			input[i] = Integer.parseInt(strNums[i]);
		}

		return input;
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) throws IOException {

		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		printIntersection(arr1, arr2);

	}

}
