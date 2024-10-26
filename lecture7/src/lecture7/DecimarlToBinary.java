package lecture7;

import java.util.Scanner;

public class DecimarlToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int bit=0;
		int binary=0;
		int place=1;

		while(n!=0)
		{
			bit=n%2;
			binary=binary+(bit*place);
			place*=10;
			n/=2;
		}
		System.out.println(binary);


	}

}
