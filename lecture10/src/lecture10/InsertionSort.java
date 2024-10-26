package lecture10;

public class InsertionSort {
	public static void insertionSort(int[] input){
		
		for(int i=1;i<input.length;i++) 
		{
			int j;
			int temp=input[i];
			for(j=i-1; j>=0 && input[j]>temp;j--)
			{
				input[j+1] = input[j];
			}
			input[j+1]=temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {21,94,56,18,9,1,0,28};
		insertionSort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}
}
