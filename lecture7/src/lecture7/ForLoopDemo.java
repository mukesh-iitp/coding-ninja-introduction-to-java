package lecture7;

public class ForLoopDemo {
	public static void main (String[] args) {
	    for(int i=12;i>0;i=i%3)
	    {
	        System.out.print("*");
	    }
	
	
	  /*for(int i=7;i!=0;i--)		//Infinite loop
	    {
	        System.out.print(i--);
	    }
	  */ 
	  for(int i=1;;i++)
	    {   if(i==5)
	            break;
	        System.out.print(i);
	    }
	  
	  for(int i=1;;i++)
	    {   if(i<5)
	            System.out.print(i);
	        else 
	            break;
	    }
	  
	  for(int i=1;;i++)
	    {   if(i>5)
	        {
	            break;
	            //System.out.print("break statement reached"); //We can't use statement after break;
	        }
	        System.out.print(i);
	    }
	  
	  System.out.println();
	  int i = 1;
	  while(i < 5) {
	      if(i == 3) {
	          break;
	      }
	      System.out.print(i + " ");
	      i++;
	  }
	}
}
