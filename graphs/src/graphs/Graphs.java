	package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graphs {

	public static ArrayList<Integer> getPathBFS(int [][] edges, int v1,int v2){
		boolean visited[] = new boolean[edges.length];
		return getPathBFSHelper(edges, visited, v1, v2);

	}	

	private static ArrayList<Integer> getPathBFSHelper(int[][] edges, boolean[] visited, int v1, int v2) {
		if(v1==v2)		{
			ArrayList<Integer> ans=new ArrayList<Integer>();
			ans.add(v1);
			visited[v1]=true;
			return ans;
		}

		Queue<Integer> q=new LinkedList<Integer>();
		HashMap<Integer,Integer> h=new HashMap<>();
		ArrayList<Integer> ans=new ArrayList<>();
		q.add(v1);
		visited[v1]=true;
		while(!q.isEmpty() ){
			int first=q.remove();
			for(int i=0;i<edges.length;i++){
				if(edges[first][i]==1 && !visited[i]){
					visited[i]=true;
					q.add(i);
					h.put(i,first);
					if(i==v2)
					{    ans.add(i); 
					while(!ans.contains(v1)){

						int b=h.get(i);
						ans.add(b);
						i=b;
					}
					return ans;
					}
				}
			}
		}
		return null;
	}

	public static ArrayList<Integer> getPathDFS(int [][] edges, int v1,int v2){
		boolean visited[] = new boolean[edges.length];
		return getPathDFSHelper(edges, visited, v1, v2);

	}

	private static ArrayList<Integer> getPathDFSHelper(int[][] edges, boolean[] visited, int v1, int v2) {

		if(v1 == v2) {
			ArrayList<Integer> ans=new ArrayList<>();
			visited[v1]=true;
			ans.add(v1);
			return ans;
		}

		visited[v1]=true;
		for(int i=0; i<edges.length; i++) {
			if(edges[v1][i] == 1 && !visited[i]) {
				ArrayList<Integer> list = getPathDFSHelper(edges, visited, i, v2);
				if(list != null) {
					list.add(v1);
					return list;
				}
			}
		}

		return null;

	}

	public static boolean hasPath(int [][] edges, int v1,int v2) {
		boolean visited[] = new boolean[edges.length];
		return hasPathHelper(edges, v1, v2, visited);

	}

	private static boolean hasPathHelper(int[][] edges, int v1, int v2, boolean[] visited) {
		Queue<Integer> q = new LinkedList<>();
		q.add(v1);
		int n=edges.length;
		while(q.size()!=0){
			int front=q.remove();
			visited[front]=true;
			if(front==v2){
				//System.out.print("true");
				return true;
			}
			for(int i=0;i<n;i++){
				if(edges[front][i] == 1 && !visited[i]){
					visited[i] = true;
					q.add(i);
				}
			}
		}
		//System.out.print("false");
		return false;
	}

	public static void printGraphUsingBFS(int [][] edges) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0; i<edges.length; i++) {
			if(!visited[i])
				printGraphUsingBFSHelper(edges, i, visited);
		}
	}

	public static void printGraphUsingBFSHelper(int [][] edges, int sv, boolean [] visited) {
		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		q.enqueue(sv);
		int n=edges.length;
		visited[sv]=true;
		while(!q.isEmpty()) {
			int front;
			try {
				front = q.dequeue();
			} catch (QueueEmptyException e) {
				return;
			}
			System.out.print(front+" ");
			for(int i=0; i<n; i++) {
				if(edges[front][i] == 1 && !visited[i]) {
					q.enqueue(i);
					visited[i] = true;
				}
			}

		}

	}


	public static void printGraphUsingDFSHelper(int [][] edges, int sv, boolean [] visited) {

		System.out.print(sv+" ");
		visited[sv] = true;

		int n=edges.length;
		for(int i=0; i<n ;i++) {
			if(edges[sv][i] == 1 && !visited[i]) {
				printGraphUsingDFSHelper(edges, i, visited);
			}
		}
	}

	public static void printGraphUsingDFS(int [][] edges) {

		boolean visited[] = new boolean[edges.length];
		for(int i=0; i<edges.length ; i++) {
			if(!visited[i])
				printGraphUsingDFSHelper(edges, i, visited);
		}
	}

	public static boolean isConnected(int[][] edges){
		boolean[] visited=new boolean[edges.length];		
		DFS(edges,0,visited);
		for(int i=0; i<edges.length ; i++) {
			if(!visited[i])
				return false;
		}
		return true;
	}
	public static void  DFS(int[][] edges,int startver,boolean[] visited){
		visited[startver]=true;
		for(int i=0;i<edges.length;i++){
			if(edges[startver][i]==1 && !visited[i]){
				visited[i]=true;
				DFS(edges,i,visited);
			}
		}
		return ;
	}

	public static void getAllConnectedComponentsHelper(int edges[][],boolean visited[],ArrayList<Integer> arr,int start){  

		visited[start]=true;
		arr.add(start);
		int n=edges.length;   
		for(int j=0;j<n;j++){
			if(edges[start][j]==1&&!visited[j]){
				getAllConnectedComponentsHelper(edges,visited,arr,j); 
			}
		}
	}

	public static void getAllConnectedComponents(int edges[][]){
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++){
			if(!visited[i]){
				ArrayList<Integer> arrans= new ArrayList<Integer>();
				getAllConnectedComponentsHelper(edges,visited,arrans,i);
				Collections.sort(arrans);
				for(int j=0;j<arrans.size();j++)
					System.out.print(arrans.get(j)+" ");   
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		int n;
		int e;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		e=sc.nextInt();

		int edges[][] = new int [n][n];
		for(int i=0; i<e ; i++) {
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}

		/*
		System.out.print("DFS Print: ");
		printGraphUsingDFS(edges);
		System.out.println();
		System.out.print("BFS Print: ");
		printGraphUsingBFS(edges);
		 */

		/*
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();

		System.out.println(hasPath(edges, v1, v2));
		ArrayList<Integer> path=getPathDFS(edges,v1,v2);
		ArrayList<Integer> path=getPathBFS(edges,v1,v2);

		if(path != null){
			for(int elem:path){
				System.out.print(elem+" ");
			}
		}
		 */
		//System.out.println(isConnected(edges));
		
		getAllConnectedComponents(edges);

	}
}	
