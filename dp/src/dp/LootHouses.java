package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LootHouses {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
		if (houses.length==0)
			return 0;
		if (houses.length==1)
			return houses[0];
		if (houses.length==2)
			return Math.max(houses[0],houses[1]);

		int n = houses.length;
		int[] dp = new int[n];
		dp[0]=houses[0];
		dp[1]=Math.max(houses[0],houses[1]);

		for (int i=2;i<n;i++)
		{
			int maxVal1=dp[i-2]+houses[i];
			int maxVal2=dp[i-1];
			dp[i]=Math.max(maxVal1,maxVal2);
		}
		return dp[n-1];

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[] takeInput() throws IOException {
		int n = Integer.parseInt(br.readLine().trim());

		if (n == 0) {
			return new int[0];
		}

		String[] strNums = br.readLine().trim().split("\\s");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(strNums[i]);
		}

		return arr;
	}

	public static void main(String[] args) throws IOException {

		int[] arr = takeInput();
		System.out.println(LootHouses.maxMoneyLooted(arr));

	}

}
