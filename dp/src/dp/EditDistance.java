package dp;

public class EditDistance {
	
	public static int editDistance(String s1, String s2) {
		
		if(s1.length()==0)
			return s2.length();
		if(s2.length()==0)
			return s1.length();
		
		if(s1.charAt(0)==s2.charAt(0)) {
			return editDistance(s1.substring(1), s2.substring(1));
		}
		else {
			//insertion operation
			int op1 = editDistance(s1, s2.substring(1));
			//deletion operation
			int op2 = editDistance(s1.substring(1), s2);
			//Substitute operation
			int op3 = editDistance(s1.substring(1), s2.substring(1));
			
			return 1+ Math.min(op1, Math.min(op2, op3));
		}
		
	}
	
	public static int editDistanceM(String s1, String s2) {
		int m=s1.length();
		int n=s2.length();
		int storage[][] = new int[m+1][n+1];
		
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++)
				storage[i][j]=-1;
		}
		
		return editDistanceM(s1, s2, storage);
		
	}
	
	private static int editDistanceM(String s1, String s2, int[][] storage) {
		int m=s1.length();
		int n=s2.length();
		
		if(storage[m][n] != -1)
			return storage[m][n];
		
		if(m==0) {
			storage[m][n]=n;
			return storage[m][n];
		}
		if(n==0) {
			storage[m][n]=m;
			return storage[m][n];
		}
		
		if(s1.charAt(0)==s2.charAt(0)) {
			storage[m][n] = editDistanceM(s1.substring(1), s2.substring(1), storage);
		}
		else {
			//insertion operation
			int op1 = editDistanceM(s1, s2.substring(1), storage);
			//deletion operation
			int op2 = editDistanceM(s1.substring(1), s2, storage);
			//Substitute operation
			int op3 = editDistanceM(s1.substring(1), s2.substring(1), storage);
			
			storage[m][n] = 1+ Math.min(op1, Math.min(op2, op3));

		}
		return storage[m][n];
	}
	
	private static int editDistanceDP(String s1, String s2) {
		int m=s1.length();
		int n=s2.length();
		int storage[][] = new int[m+1][n+1];
		
		//filling base case in first row
		for(int j=0; j<=n; j++) {
			storage[0][j]=j;
		}
		
		//filling base case in first column
		for(int i=0; i<=m; i++) {
			storage[i][0]=i;
		}
	
		
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(s1.charAt(m-i)==s2.charAt(n-j)) {
					storage[i][j]=storage[i-1][j-1];
				}
				else
				{
					storage[i][j]=1+Math.min(storage[i][j-1], 
							Math.min(storage[i-1][j], storage[i-1][j-1]));
				}
			}
		}
			
		return storage[m][n];
	}

	public static void main(String[] args) {
		
		String s="abcde";
		String t="abcd";
		
		System.out.println(editDistanceDP(s, t));
		System.out.println(editDistanceM(s, t));
		System.out.println(editDistance(s, t));
		
	}

}
