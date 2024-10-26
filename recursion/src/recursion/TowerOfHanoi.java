package recursion;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here

		if(disks<=0)
        {
            //System.out.println("move 1st disk from "+source+" to "+destination);
            return;
        }
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println("move"+disks+" th disk from "+source+" to "+destination);
        towerOfHanoi(disks-1,auxiliary,source,destination);

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		TowerOfHanoi.towerOfHanoi(n, 's', 'h', 'd');
		
		s.close();
	}
}
