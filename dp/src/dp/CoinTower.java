package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinTower {

	public static String findWinner(int n, int x, int y) {
		//Your code goes here
		int[] dp = new int[n+1];
		dp[0]=0;
		dp[1]=1;

		for (int i=2;i<=n;i++){
			if (dp[i-1]==0){
				dp[i]=1;
			}
			else if ((i-x)>=0 && dp[i-x]==0){
				dp[i]=1;
			}
			else if ((i-y)>=0 && dp[i-y]==0){
				dp[i]=1;
			}
			else{
				dp[i]=0;
			}
		}

		if (dp[n]==1)
			return "Beerus";
		else
			return "Whis";

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		String[] strNums = br.readLine().trim().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int x = Integer.parseInt(strNums[1]);
		int y = Integer.parseInt(strNums[2]);

		System.out.println(CoinTower.findWinner(n, x, y));
	}
}
