package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ByteLandian {

	public static long bytelandian(long n, HashMap<Long, Long> memo) {
		// Write your code here
		if (n<12)
		{
			memo.put(n,n);
			return n;
		}

		if (!memo.containsKey(n))
		{
			long ans1=bytelandian(n/2,memo);
			long ans2=bytelandian(n/3,memo);
			long ans3=bytelandian(n/4,memo);

			long currVal=ans1+ans2+ans3;
			if (currVal>n)
				memo.put(n,currVal);
			else
				memo.put(n,n);
		}

		return memo.get(n);
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		long n = Long.parseLong(br.readLine().trim());
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
		System.out.println(bytelandian(n, memo));


	}

}
