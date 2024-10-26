package timecomplexity;

public class MergeSort {

public static void mergeSort(int[] arr, int startIndex, int lastIndex){
    // Write your code here

    if(lastIndex<=startIndex)
        return;

    int mid=(startIndex+lastIndex)/2;

    mergeSort(arr, startIndex, mid);

    mergeSort(arr, mid+1, lastIndex);

    merg(arr,startIndex,lastIndex);

}

private static void merg(int [] arr, int startIndex, int lastIndex)
{
	int mid=(startIndex+lastIndex)/2;
	
	int ans[]=new int[lastIndex-startIndex+1];
	
	int i=startIndex;
	int j=mid+1;
	int k=0;
	
	while(i<=mid & j<=lastIndex)
	{
		if(arr[i]<arr[j]) 
			ans[k++]=arr[i++];
		else
			ans[k++]=arr[j++];
	}
	while(i<=mid)
		ans[k++]=arr[i++];

	while(j<=lastIndex)
		ans[k++]=arr[j++];

	
	for(int index=0;index<ans.length;index++)
		arr[startIndex+index]=ans[index];
	
}


	
	public static void main(String[] args) {
		
		for(int n=10;n<=10000000;n*=10)
		{
			int input[]=new int[n];
			
			for(int i=0; i<input.length;i++)
			{
				input[i]=input.length-i;
			}
			
			long startTime=System.currentTimeMillis();
			mergeSort(input, 0, input.length-1);
			long endTime=System.currentTimeMillis();
			
			System.out.println("Time taken to sort for "+n+" is "+(endTime-startTime)+" ms");
			
		}		
	}

}
