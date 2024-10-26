package while_loop;

public class Scope {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println(i);
		if(i==10) {
			int n=23;
			//int i=123;		duplicate local variable
			System.out.println(i);
			System.out.println(n);
		}	//scope of n ends here
		else {
			int n=427;
		}
		//System.out.println(n); 	//not allowed after parenthesis
		
		//int i=12; 	//error: duplicate local variable
		
		int n=12;		//no error because no existence of n local variable
		System.out.println(n);
		
		int j=1;
		while(j<=n) {
			int k=1;
			while(k<=j) {
				System.out.print(j);
				k=k+1;
			}
			System.out.println();
			j=j+1;
		}
		
	}

}
