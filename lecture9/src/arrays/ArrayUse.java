package arrays;

public class ArrayUse {

	public static void main(String[] args) {
		
		int arr1[]=new int[10];
		
		int n=10;
		int []arr2=new int[n];
		
		//arr1[10]=15;	//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
		
		arr1[0]=15;
		
		arr2[n-1]=12;
		
		System.out.println(arr1[0]); //default value is 0 in array
		System.out.println(arr1[1]);
		System.out.println(arr1);
		System.out.println(arr2[0]);
		System.out.println(arr2[9]);
		
		
		
		char chArray[]=new char[11];
		double dArray[]=new double[12];
		boolean bArray[]=new boolean[10];
		
		System.out.println(chArray[0]);
		chArray[1]='a';
		System.out.println(chArray[1]);
		System.out.println(dArray[0]);
		System.out.println(bArray[0]);
				

	}

}
