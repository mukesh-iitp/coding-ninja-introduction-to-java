package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeMethods {
	
	public static void printBinaryTreeRecursively(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		
		String toBePrinted=root.data+": ";
		if(root.left!=null)
			toBePrinted+="L:"+root.left.data+",";
		if(root.right!=null)
			toBePrinted+="R:"+root.right.data;
		
		System.out.println(toBePrinted);
		printBinaryTreeRecursively(root.left);
		printBinaryTreeRecursively(root.right);
	}
	public static void printBinaryTreeLevelWise(BinaryTreeNode<Integer> root) {
		if (root==null)
		{
			return;
		}
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNode=new QueueUsingLL<>();
		pendingNode.enqueue(root);
		while(!pendingNode.isEmpty())
		{
			BinaryTreeNode<Integer> front=null;
			try {
				front = pendingNode.dequeue();
			} catch (QueueEmptyException e) {
				// shouldn't come here
				return;
			}
			System.out.print(front.data+":");
			if (front.left!=null)
			{
				pendingNode.enqueue(front.left);
				System.out.print("L:"+front.left.data);
			}
			else
			{
				System.out.print("");
			}

			if (front.right!=null)
			{
				pendingNode.enqueue(front.right);
				System.out.print(",R:"+front.right.data);
			}
			else
			{
				System.out.print("");
			}
			System.out.println();
		}
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {	
		Scanner sc=new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		System.out.print("Enter root data: ");
		int rootData=sc.nextInt();
		if(rootData==-1)
			return null;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front=pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of "+front.data);
			int leftChild=sc.nextInt();
			if(leftChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter right child of "+front.data);
			int rightChild=sc.nextInt();
			if(rightChild!=-1) {
				BinaryTreeNode<Integer> child=new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right=child;
			}			
		}
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputRecursively(Scanner sc){
		
		int rootData;
		System.out.print("Enter root data: ");
		rootData=sc.nextInt();
		
		if(rootData==-1)
			return null;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		root.left=takeInputRecursively(sc);
		root.right=takeInputRecursively(sc);
		
		return root;
		
	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		//base case
		if(root==null)
			return 0;
		
		int ans=1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		
		return ans;
	}
	
	public static int getSumOfNodes(BinaryTreeNode<Integer> root) {
		//base case
		if(root==null)
			return 0;
		
		int sum=root.data;
		sum+=getSumOfNodes(root.left);
		sum+=getSumOfNodes(root.right);
		
		return sum;
		
	}
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //base case
		if(root==null)
			return false;
		
		if(root.data==x)
			return true;
		
		else
			return (isNodePresent(root.left,x)||isNodePresent(root.right,x));
				
	}
	
	public static int largestNode(BinaryTreeNode<Integer> root){
		if(root==null)
			return -1;
		
		int largestLeft=largestNode(root.left);
		int largestRight=largestNode(root.right);
		
		return Math.max(root.data, Math.max(largestLeft, largestRight));
	}
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        if (root == null)
            return 0;

        if (root.data > x)
            return 1 + countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
        else
            return countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);		
	
	}
	
	public static int heightOfBinaryTree(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null)
			return 0;
		
		return Math.max(heightOfBinaryTree(root.left), heightOfBinaryTree(root.right)) + 1;
	}
	
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		return noOfLeafNodes(root.left)+noOfLeafNodes(root.right);
		
	}
	
	public static void printNodesAtDepthK(BinaryTreeNode<Integer> root, int k) {
		
		if(root==null)
			return;
		
		if(k==0)
			System.out.print(root.data+",");
		
		printNodesAtDepthK(root.left,k-1);
		printNodesAtDepthK(root.right,k-1);
		
	}
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		//Your code goes here
		changeToDepthTree(root,0);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth)
	{
		if (root==null)
		{
			return;
		}
		root.data=depth;
		changeToDepthTree(root.left,depth+1);
		changeToDepthTree(root.right,depth+1);

	}
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here

		if(root==null)
			return ;
		if(root.left!=null && root.right==null)
			System.out.print(root.left.data+" ");

		if(root.left==null && root.right!=null)
			System.out.print(root.right.data+" ");

		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);

	}
	
	public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return null;
		if(root.left==null && root.right==null)
			return null;
		
		root.left=removeLeafNodes(root.left);
		root.right=removeLeafNodes(root.right);
		
		return root;
	}
		
	public static boolean isBinaryTreeBalanced(BinaryTreeNode<Integer> root) {
		//First approach
		if(root==null)
			return true;
		int leftheight=heightOfBinaryTree(root.left);
		int rightheight=heightOfBinaryTree(root.right);
		
		if(Math.abs(leftheight-rightheight) > 1)
			return false;
		
		boolean isLeftBalanced=isBinaryTreeBalanced(root.left);
		boolean isRightBalanced=isBinaryTreeBalanced(root.right);
				
		return isLeftBalanced && isRightBalanced;	
	}
	
	public static BalancedTreeReturn isBinaryTreeBalancedBetter(BinaryTreeNode<Integer> root) {
		
		//base case
		if(root==null)
		{
			int height=0;
			boolean isBalanced=true;
			BalancedTreeReturn ans=new BalancedTreeReturn();
			ans.height=height;
			ans.isBalanced=isBalanced;
			return ans;
		}
		
		BalancedTreeReturn leftOutput=isBinaryTreeBalancedBetter(root.left);
		BalancedTreeReturn rightOutput=isBinaryTreeBalancedBetter(root.right);
		
		boolean isBalanced=true;
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		
		if(Math.abs(leftOutput.height-rightOutput.height) > 1)
			isBalanced=false;
		
		if(!leftOutput.isBalanced || !rightOutput.isBalanced)
			isBalanced=false;
		
		BalancedTreeReturn ans=new BalancedTreeReturn();
		ans.height=height;
		ans.isBalanced=isBalanced;
		
		return ans;		
		
	}
	
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		
		if(root==null)
			return 0;
		
		int option1=heightOfBinaryTree(root.left)+heightOfBinaryTree(root.right);
		int option2=diameterOfBinaryTree(root.left);
		int optoin3=diameterOfBinaryTree(root.right);
		
		return Math.max(option1, Math.max(option2, optoin3));
		
	}
	
	public static HeightAndDiameterReturn<Integer, Integer> diameterOfBinaryTreeBetter(BinaryTreeNode<Integer> root){
		
		if(root==null) {
			HeightAndDiameterReturn<Integer, Integer> output=new HeightAndDiameterReturn<>();
			output.height=0;
			output.diameter=0;
			return output;
		}
		
		HeightAndDiameterReturn<Integer, Integer> leftOutput=diameterOfBinaryTreeBetter(root.left);
		HeightAndDiameterReturn<Integer, Integer> rightOutput=diameterOfBinaryTreeBetter(root.right);
		
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		
		int option1=leftOutput.height + rightOutput.height;
		int option2=leftOutput.diameter;
		int option3=rightOutput.diameter;
		
		int diameter=Math.max(option1, Math.max(option2, option3));
		
		HeightAndDiameterReturn<Integer, Integer> output=new HeightAndDiameterReturn<>();
		output.height=height;
		output.diameter=diameter;
		return output;
	}
	
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root==null)
			return;

		BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
		
	}
	
	public static void inorderTraversal(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root == null)
			return;
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}
	
	public static BinaryTreeNode<Integer> buildTreePre(int[] inOrder, int[] preOrder) {
		//Your code goes here
		return buildTreePreHelper(inOrder,preOrder,0,inOrder.length-1,0,preOrder.length-1);
	}
	
	private static BinaryTreeNode<Integer> buildTreePreHelper(int[] inOrder, int[] preOrder, int inS, int inE, int prS, int prE) {
		
		if(inS>inE)
			return null;
		
		int rootData=preOrder[prS];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		
		int rootIndex=-1;
		for(int i=inS;i<=inE;i++) {
			if(inOrder[i]==rootData) {
				rootIndex=i;
				break;
			}
		}
		if(rootIndex==-1)
			return null;
		
		int leftInS=inS;
		int leftInE=rootIndex-1;
		int leftPrS=prS+1;
		int leftPrE=leftInE-leftInS+leftPrS;
		
		int rightInS=rootIndex+1;
		int rightInE=inE;
		int rightPrS=leftPrE+1; 
		int rightPrE=prE;
		
		root.left=buildTreePreHelper(inOrder, preOrder, leftInS, leftInE, leftPrS, leftPrE);
		root.right=buildTreePreHelper(inOrder, preOrder, rightInS, rightInE, rightPrS, rightPrE);
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTreePost(int[] inOrder, int[] postOrder) {
		//Your code goes here
		return buildTreePostHelper(inOrder,postOrder,0,inOrder.length-1,0,postOrder.length-1);
	}
	private static BinaryTreeNode<Integer> buildTreePostHelper(int[] inOrder, int[] postOrder, int inS, int inE, int poS, int poE){
		if(inS>inE)
			return null;
		
		int rootData=postOrder[poE];
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		
		int rootIndex=-1;
		for(int i=inS;i<=inE;i++) {
			if(inOrder[i]==rootData) {
				rootIndex=i;
				break;
			}
		}
		if(rootIndex==-1)
			return null;

		int leftInS=inS;//ok
		int leftInE=rootIndex-1;//ok
		int leftPoS=poS;//ok
		int leftPoE=leftInE-leftInS+leftPoS;

		int rightInS=rootIndex+1;//ok
		int rightInE=inE;//ok
		int rightPoS=leftPoE+1; 
		int rightPoE=poE-1;//ok

		root.left=buildTreePostHelper(inOrder, postOrder, leftInS, leftInE, leftPoS, leftPoE);
		root.right=buildTreePostHelper(inOrder, postOrder, rightInS, rightInE, rightPoS, rightPoE);

		return root;
	}

	public static MinMaxReturn<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root.right == null && root.left == null)
		{
			MinMaxReturn<Integer, Integer> p=new MinMaxReturn<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
			p.minimum = root.data;
			p.maximum = root.data;
			return p;
		}

		MinMaxReturn<Integer, Integer> ans=new MinMaxReturn<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
		ans.minimum = root.data;
		ans.maximum = root.data;

		if (root.left != null)
		{
			MinMaxReturn<Integer, Integer> leftAns = getMinAndMax(root.left);
			ans.minimum = Math.min(ans.minimum, leftAns.minimum);
			ans.maximum = Math.max(ans.maximum, leftAns.maximum);
		}

		if (root.right != null)
		{
			MinMaxReturn<Integer, Integer> rightAns = getMinAndMax(root.right);
			ans.minimum = Math.min(ans.minimum, rightAns.minimum);
			ans.maximum = Math.max(ans.maximum, rightAns.maximum);
		}

		return ans;
	}
	
	public static ArrayList<Integer> getRootToNode(BinaryTreeNode<Integer> root, int data){
		
		if(root==null)
			return null;
		
		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput=getRootToNode(root.left, data);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput=getRootToNode(root.right, data);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		else
			return null;
			
		
	}

}
