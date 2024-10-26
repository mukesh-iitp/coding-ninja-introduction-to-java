package maps;

import java.util.HashMap;

public class MaxFrequencyNumber {
	
	public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		int max = 0, ans = Integer.MIN_VALUE;
		for(int i : arr) {
			if(map.get(i) > max){
				max = map.get(i);
				ans = i; 
				}
		}
		
		return ans;
    }

}
