package recursion;

public class QuickSort {
	
	public static void quickSort(int[] input,int startIndex, int endIndex) {
		
		//base case
		if(endIndex<=startIndex)
			return;
		
		int pivotPosition=partition(input, startIndex, endIndex);
		
		quickSort(input, startIndex, pivotPosition-1);
		quickSort(input, pivotPosition+1, endIndex);		
		
	}
	
	private static int partition(int[] input, int startIndex, int endIndex)
	{
		//find pivot
		int pivot=input[startIndex];
		
		//find pivot position
		int count=0;
		int s=startIndex+1;
		while(s<=endIndex)
		{
			if(input[s]<=pivot)
				count++;
			
			s++;
		}
		
		int pivotPosition=startIndex+count;
		
		//swapping with pivot position
		input[startIndex]=input[pivotPosition];
		input[pivotPosition]=pivot;
		
		//ensuring left and right items w.r.t. pivot position
		int i=startIndex;
		int j=endIndex;
		
		while(i<pivotPosition && j>pivotPosition)
		{
			if(input[i]<=input[pivotPosition])
				i++;
			else if(input[j]>input[pivotPosition])
				j--;
			else
			{
				int temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}

		}	
		return pivotPosition;
	}


    public static void main(String[] args) {
        int[] input = {6, 2, 20, 8, 15, 3, 4};
        
        QuickSort.quickSort(input, 0, input.length - 1);
        
        for(int i = 0; i < input.length; i++) 
        {
            System.out.print(input[i] + " ");
        }	
    }
}

 
