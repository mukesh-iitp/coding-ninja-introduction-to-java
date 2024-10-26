/* input:
 	6 11
	0 1 2
	0 2 4
	2 3 6
	1 3 1
	2 4 9
	4 5 5 
	3 5 7
	4 3 11
	2 5 10
	2 1 8
	0 3 3
 */

package MST;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	
	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
	
}

public class KruskalAlgorithm {
	
	public static int findParent(int v, int parent[]) {
		if(parent[v]==v)
			return v;
		
		return findParent(parent[v], parent);
	}
	
	public static void kruskals(Edge[] input, int n) {
		Arrays.sort(input);
		Edge output[] = new Edge[n-1];
		
		int parent[] = new int[n]; 
		for(int i=0; i<n; i++)
			parent[i] = i; //initializing the parent array
		
		int count = 0;	//count the numbers of edges came in out MST
		int i = 0;	//count the current edge on which we will be working
		
		while(count != n-1) {
			Edge currentEdge = input[i];
			int sourceParent = findParent(currentEdge.source, parent);
			int destParent = findParent(currentEdge.dest, parent);
			if(sourceParent != destParent) {
				output[count] = currentEdge;
				count++;
				parent[sourceParent] = destParent;
			}
			i++;
		}
		
		for(int j=0; j<n-1; j++) {
			if(output[j].source < output[j].dest)
				System.out.println(output[j].source+" "+output[j].dest+
						" "+output[j].weight);
			else
				System.out.println(output[j].dest+" "+output[j].source+
						" "+output[j].weight);
		}
	}	
	
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int E = s.nextInt();
			
			Edge input[] = new Edge[E];
			for(int i=0; i<E; i++) {
				input[i] = new Edge();
				input[i].source = s.nextInt();
				input[i].dest = s.nextInt();
				input[i].weight = s.nextInt();
			}
			
			kruskals(input, n);
		}
		
	}


}
