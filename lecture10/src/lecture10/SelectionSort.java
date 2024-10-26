package lecture10;

public class SelectionSort {
	
	public static void selectionSort(int[] input){
		for(int i=0;i<input.length-1;i++) //0-length-2
		{
			int min=input[i];
			int minIndex=i;
			for(int j=i+1; j<input.length;j++)
			{
				if(input[j]<min) 
				{
					min=input[j];
					minIndex=j;
				}
			}
			if(minIndex!=i) 
			{
			input[minIndex]=input[i];
			input[i]=min;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] input = {21,94,56,18,9,1,0,28};
		selectionSort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
		
	}

}
