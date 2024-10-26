package lecture7;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a=10;
		System.out.println(a++); 
		a++;
		++a;
		System.out.println(a);
		
		int b=a++;
		System.out.println(b);
		System.out.println(a);
		
		System.out.println("-------------------");
		int x=10;
		System.out.println(x--); 
		x--;
		--x;
		System.out.println(x);
		
		int y=x--;
		System.out.println(y);
		System.out.println(x);
		
		System.out.println("-------------------");
		int z=4;
		z*=2;
		System.out.println(z);
		
		z^=2;
		System.out.println(z);
		
		System.out.println("-------------------");
		int ans=2*3/2;  //same precedence then we will go from left to right
		System.out.println(ans);
		
		
		System.out.println(a+++--b);//line 1
	   // System.out.println(a--+++b);//line 2
	    System.out.println(a++-++b);//line 3
	    //System.out.println(a+++++b);//line 4
	    
	 
	}

}
