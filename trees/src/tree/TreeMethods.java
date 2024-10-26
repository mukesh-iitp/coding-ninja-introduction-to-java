package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeMethods {
	
	public static TreeNode<Integer> takeInputRecursively(Scanner sc){
		
		int n;
		System.out.println("Enter next node");
		n=sc.nextInt();
		TreeNode<Integer> root= new TreeNode<Integer>(n);
		
		System.out.println("Enter no of children for n: ");
		int childCount = sc.nextInt();
		for(int i=0 ; i<childCount ; i++) {
			TreeNode<Integer> child = takeInputRecursively(sc);
			root.children.add(child);
		}

		return root;
	}
	
	
	public static TreeNode<Integer> takeInputLevelWise(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData=sc.nextInt();
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNodes.dequeue();
				System.out.println("Enter the number of children of "+frontNode.data);
				int numChildren=sc.nextInt();
				for(int i=0; i<numChildren; i++) {
					System.out.println("Enter "+(i+1)+"th"+" child of "+frontNode.data);
					int child=sc.nextInt();
					TreeNode<Integer> childNode=new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				//shouldn't come here
				return null;
			}			
		}
		return root;
	}
	
	public static void printTreeRecursively(TreeNode<Integer> root) {
		
		String s=root.data+":";
		for(int i=0; i< root.children.size(); i++)
			s=s+root.children.get(i).data+",";
		
		System.out.println(s);
		
		for(int i=0; i<root.children.size(); i++)
			printTreeRecursively(root.children.get(i));
	}
	
	public static void printTreeLevelWise(TreeNode<Integer> root) {
		/*
		QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<TreeNode<Integer>>();
		
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNodes.dequeue();
				System.out.print(frontNode.data+": ");
				for(int i=0;i<frontNode.children.size();i++) {
					System.out.print(frontNode.children.get(i).data+" ");
					pendingNodes.enqueue(frontNode.children.get(i));
				}
				System.out.println();
				
			} catch (QueueEmptyException e) {
				//shouldn't come here
			}
			
		}
		*/
		
		if(root == null){
			return; 
		}
		
		QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		q.enqueue(root);
		q.enqueue(nullNode);
		
		System.out.println(root.data);
		while(q.size()!=1) {
			TreeNode<Integer> temp= null;
			try { 
				temp = q.dequeue(); 
				} 
			catch (QueueEmptyException e) { 
				//shouldn't come here
			} 
			if(temp==nullNode) {
				q.enqueue(nullNode);
				System.out.println();
				continue; 
				} 
			for(int i = 0;i<temp.children.size();++i) {
				System.out.print(temp.children.get(i).data+" ");
				q.enqueue(temp.children.get(i)); 
				} 
			}
	}
	public static void printTreeLevelWise2(TreeNode<Integer> root){
		
		if(root == null)
			return;
		
		QueueUsingLL<TreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		while(!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNodes.dequeue();
				if(frontNode!=null) {
				System.out.print(frontNode.data+" ");
				for(int i=0; i<frontNode.children.size(); i++) 
					pendingNodes.enqueue(frontNode.children.get(i));
				}
				else {
					System.out.println();
					if(!pendingNodes.isEmpty()) 
						pendingNodes.enqueue(null);
				}
					
			} catch (QueueEmptyException e) {
				//shouldn't come here
			}			
		}

	}
	
	public static int numberOfNodes(TreeNode<Integer> root) {
		
		//base case
		if(root == null)
			return 0;
		//this is not a base case but it is edge case
		
		int count=1;
		for(int i=0; i<root.children.size();i++)
			count+=numberOfNodes(root.children.get(i));
		return count;
	}
	
	public static int sumOfAllNode(TreeNode<Integer> root){
		
		if(root == null)
			return 0;

		int sum=0;
		for(int i=0; i<root.children.size();i++)
			sum += sumOfAllNode(root.children.get(i));
		return root.data+sum;
	}
	
	public static int nodeWithLargestData(TreeNode<Integer> root) {
		
		if(root == null)
			return Integer.MIN_VALUE;
		
		int ans=root.data;
		for(int i=0; i<root.children.size();i++) {
			int childLargest=nodeWithLargestData(root.children.get(i));
			if(childLargest>ans)
				ans=childLargest;
		}
		return ans;
	}
	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
		if(root==null)
			return 0;

		int count=0;
		if(root.data>x)
			count++;

		for(int i=0; i<root.children.size();i++){
			count+=numNodeGreater(root.children.get(i), x);
		}
		return count;
	}
	
	public static int getHeight(TreeNode<Integer> root){
		
		if(root == null) {
			return 0; 
			}
		int ans = 0;
		for(TreeNode<Integer> child : root.children) {
			int childHeight = getHeight(child);
			if(childHeight > ans) {
				ans = childHeight; 
				}
			} 
		return ans + 1;		
	}
	
	public static void printNodesAtK(TreeNode<Integer> root,int k) {
		
		if(k<0)
			return;
		
		if(k==0)
		{
			System.out.print(root.data+" ");
			return;
		}
		
		for (int i = 0; i < root.children.size(); i++) {
			printNodesAtK(root.children.get(i), k - 1);
		}	
	}
	
	public static int numberOfLeafNodes(TreeNode<Integer> root) {
		
		if(root == null)
			return 0;
		
		int count = 0;
		if(root.children.size() == 0)
			count++;
		for(TreeNode<Integer> child : root.children)
			count += numberOfLeafNodes(child);
		return count;
	}
	
	public static void printPreOrder(TreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		for(TreeNode<Integer> child : root.children)
			printPreOrder(child);
	}
	
	public static void printPostOrder(TreeNode<Integer> root){
		
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		for(TreeNode<Integer> child : root.children)
			printPreOrder(child);
		
	}
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
		if(root==null)
			return false;

		//boolean ans=false;
		if(root.data==x)
			return true;

		for(int i=0; i<root.children.size();i++){
			//checkIfContainsX(root.children.get(i), x);
			// if(root.data==x)
			// 	ans=true;
			if(checkIfContainsX(root.children.get(i), x))
                return true;
		}
		return false;

	}
	

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
		if(root == null) 
			return null;

		TreeNode<Integer> nextLargerNode = null;
		if(root.data > n) 
			nextLargerNode = root;

		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
			if(nextLargerInChild != null) {
				if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
					nextLargerNode = nextLargerInChild;
				}
			}
		}
		return nextLargerNode;

	}
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){

		if(root.children.size() == 0){
			return null;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> fl=root,sl=null;
		int data = 0;
		queue.add(root);

		while(!queue.isEmpty())
		{
			TreeNode<Integer> frontNode = queue.poll();

			for(int i=0;i<frontNode.children.size();i++){
				queue.add(frontNode.children.get(i));
			}

			if(frontNode.data >  data){
				if(frontNode.data > fl.data){
					sl = fl;
					data = fl.data;
					fl = frontNode;
				}
				else if (frontNode.data < fl.data){
					sl = frontNode;
					data = sl.data;
				}
			}
		}

		return sl;


	}
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		if(root==null)
		{
			return;
		}
		replaceWithDepthValue(root,0);

	}
	public static void replaceWithDepthValue(TreeNode<Integer>root,int depth)
	{
		root.data=depth;
		for(TreeNode<Integer>child:root.children)
		{
			replaceWithDepthValue(child,depth+1);
		}
	}
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
		TreeNode<Integer> ans=root;
		
		int sum=root.data;
		
		for(int i=0;i<root.children.size();i++) {
			sum+=root.children.get(i).data;
		}
		
		for(int i=0; i<root.children.size();i++)
		{
			TreeNode<Integer> childMax=maxSumNode(root.children.get(i));
			
			int smallSum=childMax.data;
			
			for(int j=0;j<childMax.children.size();i++) {
				smallSum+=childMax.children.get(j).data;
			}
			
			if(sum<=smallSum)
			{
				ans=childMax;
				sum=smallSum;
			}
			
		}
		
		return ans;
	}
	

}

