package dp;

public class BalancedBTs {

	public static int countBalancedBTs(int h) {
		int mod=(int)Math.pow(10, 9)+7;
		return countBalancedBTs(h, mod);

	}

	public static int countBalancedBTs(int h, int mod) {

		if(h==0 || h==1)
			return 1;

		int x=countBalancedBTs(h-1);
		int y=countBalancedBTs(h-2);
		long res1=(long)x*x;
		long res2=(long)x*y*2;
		int value1=(int)(res1 % mod);
		int value2=(int)(res2 % mod);

		return (value1+value2)%mod;

	}

	public static int countBalancedBTsDP(int height){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		if(height == 0){
			return 1; 
		}
		int storage[] = new int[height + 1];
		storage[0] = storage[1] = 1;
		int mod = (int) Math.pow(10, 9) + 7; 
		for(int i = 2; i <= height; i++){

			long temp1 = (long) (storage[i- 1]) * storage[ i - 1];
			temp1 = temp1 % mod; 

			long temp2 = 2 * (long) (storage[i - 1]) * storage[ i - 2]; 
			temp2 = temp2 % mod;
			storage[i] = (int) (temp1 + temp2) % mod; 
		}
		return storage[height]; 

	}

	public static void main(String[] args) {

		int h=10;
		System.out.println(countBalancedBTs(h));

	}

}
