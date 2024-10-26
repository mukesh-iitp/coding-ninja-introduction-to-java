package linkedList;

import java.util.ArrayList;

public class ArrayListDemo {
	
	  public static ArrayList<Integer> removeconsecutiveDuplicates(int arr[]){
		    ArrayList<Integer> result= new ArrayList<>();
		    result.add(arr[0]);
		    for(int i=1;i<arr.length;i++){
		        if(arr[i]!= arr[i-1]){
		            result.add(arr[i]);
		        }
		    }
		    return result;
		}
	
	public static void main(String[] args) {
		
		//ArrayList<Integer> list=new ArrayList<Integer>();
		//or
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println(list.size());
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		list.add(2, 50);	//adding a new element in the list
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		System.out.print("[");
		for(int i=0;i<list.size();i++)
			System.out.print(list.get(i)+" " );
		System.out.println("]");
		
		list.set(1, 101);	//replacing an element in the list.
		for (int element : list) {
			System.out.print(element+" " );
		}
		System.out.println();
		
		list.remove(0);
		System.out.println(list);
		
		int arr[]= {10,10,20,20,20,30,40,10};
        ArrayList<Integer> result= removeconsecutiveDuplicates(arr);
        for(int i=0;i<result.size();i++){
          System.out.print(result.get(i)+" ");
        }
		
		
	}
	
}
