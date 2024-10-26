package dp;

public class MinimumCountOfSquares {
	
	public static int minimumCountOfSquares(int n) {
		if(n==0)
			return 0;
		
		int min=Integer.MAX_VALUE;
		for(int i=1; i*i<=n ;i++) {
			int currentMin= minimumCountOfSquares(n-(i*i));
			if(min > currentMin)
				min=currentMin;
		}
		return 1+min;
	}
	
	public static int minimumCountOfSquaresRDP(int n) {
		int storage[]=new int[n+1];
		for(int i=0; i<storage.length;i++)
			storage[i]=-1;
		
		return minimumCountOfSquaresRDP(n,storage);
		
	}
	
	private static int minimumCountOfSquaresRDP(int n, int[] storage) {
	
		if(n==0)
			return 0;
		
		int min=Integer.MAX_VALUE;
		for(int i=1; i*i<=n ;i++) {
			int currentMin;
			if(storage[n-(i*i)] == -1) {
				currentMin= minimumCountOfSquaresRDP(n-(i*i),storage);
				storage[n-(i*i)] = currentMin;
			}
			else
				currentMin = storage[n-(i*i)];
			if(min > currentMin)
				min=currentMin;
		}
		
		return 1+min;
	}
	
	public static int minimumCountOfSquaresIDP(int n) {
		
		int[] storage=new int[n+1];
		storage[0]=0;
		
		for(int i=1; i<=n; i++) {
			int minAns=Integer.MAX_VALUE;
			for(int j=1; j*j<=i; j++) {
				int currentMinAns=storage[i-(j*j)];
				if(minAns>currentMinAns)
					minAns=currentMinAns;				
			}
			storage[i]=1+minAns;
		}
		return storage[n];
	}

	public static void main(String[] args) {
	
		int n=431;
		System.out.println(minimumCountOfSquaresIDP(n));
		System.out.println(minimumCountOfSquaresRDP(n));
		System.out.println(minimumCountOfSquares(n));
	}

}
