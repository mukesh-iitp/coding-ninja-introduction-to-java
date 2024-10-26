package lecture10;

public class BubbleSort {
	
	public static void bubbleSort(int[] input) {
		for(int i=0;i<input.length-1;i++)
		{
			for(int j=i+1;j<input.length;j++)
			{
				if(input[i]>input[j])
				{
					int temp = input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {21,94,56,18,9,1,0,28};
		bubbleSort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
		

	}

}
