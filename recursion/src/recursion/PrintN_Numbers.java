package recursion;

public class PrintN_Numbers {
	
	public static void printN_Numbers(int n){
		if(n==0)
			return;

		printN_Numbers(n-1);
		System.out.print(n+" ");
	}
	
	public static void main(String[] args) {
		
		int n=10;
		printN_Numbers(n);
		
	}

}
