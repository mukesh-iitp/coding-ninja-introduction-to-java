package recursion;

public class SumOfNaturalNumbers {
	
	public static int sum(int n) {
		if(n==1)	//base case
			return 1;
		
		return sum(n-1)+n;
	}
	
	public static void main(String[] args) {
		
		int n=4;
		System.out.println(sum(n));
	}

}
