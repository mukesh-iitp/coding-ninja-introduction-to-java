package lecture10;

public class MergSortedArrays {
	
	public static int[] mergSortedArrays(int[] input1, int[] input2) {
		
		int i=0, j=0, k=0;
		
		int result[]=new int[input1.length+input2.length];
		
		while(i<input1.length && j<input2.length)
		{
			if(input1[i]<input2[j])
			{
				result[k]=input1[i];
				k++;
				i++;
			}
			else 
			{
				result[k]=input2[j];
				j++;
				k++;
			}
		}
		
		while(i<input1.length)
		{
			result[k]=input1[i];
			k++;
			i++;
		}
		while(j<input2.length)
		{
			result[k]=input2[j];
			k++;
			j++;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 6, 11, 12, 17 };
		int[] arr2 = {2, 8, 12, 16, 19 };
		
		int[] merged=mergSortedArrays(arr1, arr2);
		
		for(int i=0;i<merged.length;i++)
			System.out.print(merged[i]+" ");
		
		
		

	}

}
