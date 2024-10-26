package timecomplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TripletSum {
	 public static void findTriplet(int[] arr, int x){
	        for(int i=0;i<arr.length;i++)
	        {                              
	            for(int j=i+1;j<arr.length;j++)
	            {
	                for(int k=j+1;k<arr.length;k++)
	                {             
	                if(arr[i]+arr[j]+arr[k] == x){
	                        
	                        if(arr[i]<=arr[j] && arr[i]<=arr[k]){
	                            
	                            System.out.print(arr[i]+" ");
	                            if (arr[j]<=arr[k])
	                                System.out.println(arr[j]+" "+arr[k]);
	                           else
	                               System.out.println(arr[k]+" "+arr[j]);
	                                               
	                            
	                        }
	                        else
	                            if(arr[j]<=arr[i] && arr[j]<=arr[k]){
	                            
	                                System.out.print(arr[j]+" ");
	                            if (arr[i]<=arr[k])
	                                System.out.println(arr[i]+" "+arr[k]);
	                           else
	                               System.out.println(arr[k]+" "+arr[i]);
	                            
	                            }
	                        
	                        else{
	                        
	                            
	                                System.out.print(arr[k]+" ");
	                            if (arr[i]<=arr[j])
	                                System.out.println(arr[i]+" "+arr[j]);
	                           else
	                               System.out.println(arr[j]+" "+arr[i]);
	                            
	                        }
	                        
	                }
	            }
	        }

	        }

	    }
	 

	    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[] takeInput() throws IOException {
	        int size = Integer.parseInt(br.readLine().trim());
	        int[] input = new int[size];

	        if (size == 0) {
	            return input;
	        }
	        
	        String[] strNums; 
	        strNums = br.readLine().split("\\s");
	        

	        for (int i = 0; i < size; ++i) {
	            input[i] = Integer.parseInt(strNums[i]);
	        }

	        return input;
	    }

	    public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }

	        System.out.println();
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        int t = Integer.parseInt(br.readLine().trim());

	        while(t > 0) {

	            int[] arr = takeInput();
	            int num = Integer.parseInt(br.readLine().trim());
	            //System.out.println(TripletSum.findTriplet(arr, num));
	            findTriplet(arr, num);
	            t -= 1;
	            
	        }
	    }
}