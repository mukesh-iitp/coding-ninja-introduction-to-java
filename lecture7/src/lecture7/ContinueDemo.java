package lecture7;

public class ContinueDemo {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("===================");
		for(int k=1;k<=10;k++)
		{
			if(k==5)
				continue;
			System.out.println(k);
		}
		
		System.out.println();
		
		int i1 = 1;
		while(i1 < 3) {
		    int j = 0;
		    while(j < 5) {
		        j++;
		        if(j == 3) {
		            continue;
		        }
		        System.out.print(j + " ");
		    }
		    i1++;
		}
	}
}

