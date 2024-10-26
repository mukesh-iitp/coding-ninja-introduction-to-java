package lecture7;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2&3);
		System.out.println(2|3);
		System.out.println(2^3); //XOR
		System.out.println("complement of 2 is "+~2);	//negation or Complement of two

		
		System.out.println(34 << 1);
		System.out.println(34 >> 2);
		System.out.println(-4 << 1);
		System.out.println(-4 >> 1);
		
	    System.out.println("***************");
	    int a1=10,b1=20;
	    int c=a1&b1;
	    System.out.print(c);
	    int d=a1|b1;
	    System.out.print(d);
	    int e=a1^b1;
	    System.out.print(e);
	    int f=c+d+e;
	    System.out.print(~f);
	    
	    int a2=10,b2=-20;
	    System.out.println(a2^b2);
	    
	    int a3=19, b3=28;
	    System.out.println(~a3);
	    System.out.println(a3^b3);
	    
	    
	    System.out.println("-------------------------");
	    int x , y = 1;
        x = 10;

        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else
            System.out.println(++y);
        
        
        
        System.out.println("-------------------------");
        int x1 =10;
        int y2 = 20;
        if(x1++ > 10 && ++y2 > 20 ){
        System.out.print("Inside if  ");
        }else{
        System.out.print("Inside else  ");
        }
        System.out.println(x1 +" "+y2);
        
		
	}

}
