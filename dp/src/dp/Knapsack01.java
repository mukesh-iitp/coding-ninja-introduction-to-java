package dp;

public class Knapsack01 {

	public static int knapsack01(int[] weights, int[] values, int maxWeight){

		return knapsack01(weights, values, 0, maxWeight);
	}

	private static int knapsack01(int[] weights, int[] values, int i, int maxWeight){
		if( i==weights.length || maxWeight==0) {
			return 0;
		}

		if(weights[i] > maxWeight){
			return knapsack01(weights, values, i+1, maxWeight);
		}
		else {
			//include this nth item
			int op1 = values[i] + 
					knapsack01(weights, values, i+1, maxWeight - weights[i]);

			//don't include this nth item
			int op2 = knapsack01(weights, values, i+1, maxWeight);

			return Math.max(op1, op2);

		}

	}

	public static int knapsack01M(int[] weights, int[] values, int n, int maxWeight){

		int storage[][]=new int[n+1][maxWeight+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<maxWeight+1;j++){
				storage[i][j]=-1;
			}
		}
		return knapsack01M(weights,values,n+1,maxWeight,storage,0);
	}

	private static int knapsack01M(int[] weights, int[] values, int n, int maxWeight,int[][] storage, int i) {
		if(i==weights.length || maxWeight==0){
			storage[i][maxWeight]=0;
			return storage[i][maxWeight];
			}

		if(storage[i][maxWeight]!=-1)
			return storage[i][maxWeight];
		
		if(weights[i]>maxWeight){
			storage[i][maxWeight]=knapsack01M(weights,values,maxWeight,n-1,storage,i+1);
			return storage[i][maxWeight];
		}
		else{
			int op1=values[i]+knapsack01M(weights,values,maxWeight-weights[i],n-1,storage,i+1);
			int op2=knapsack01M(weights,values,maxWeight,n-1,storage,i+1);
			storage[i][maxWeight]=Math.max(op1,op2);
			return storage[i][maxWeight];
		}

	}
	
	public static int knapsack01I(int[] weights, int[] values,int maxWeight) {
		
		int n=values.length;
		int [][] storage=new int[n+1][maxWeight+1];
		
		for(int i=n-1; i>=0; i--) {
			for(int w=0; w<=maxWeight; w++) {
				int ans;
				if(weights[i] <= w) {
					int ans1=values[i] + storage[i+1][maxWeight-weights[i]];
					int ans2=storage[i+1][maxWeight];
					ans=Math.max(ans1, ans2);
				}
				else {
					ans=storage[i+1][w];
				}
				storage[i][w]=ans;
			}
		}
		return storage[0][maxWeight];
		
	}
	

	public static void main(String[] args) {
		int n=5;
		int[] weights = {6,1,2,4,5};
		int[] values = {10,5,4,8,6};
		int  maxWeight = 5;
		
		System.out.println(knapsack01I(weights, values, maxWeight));		
		System.out.println(knapsack01M(weights, values, n, maxWeight));
		System.out.println(knapsack01(weights, values, maxWeight));

	}

}
