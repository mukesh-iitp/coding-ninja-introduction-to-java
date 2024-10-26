package binarySearchTree;

import java.util.ArrayList;

public class BinarySearchTreeMethods {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if (root==null)
			return false;

		int rootData=root.data;
		if (k<rootData)
			return searchInBST(root.left,k);
		else if(k>rootData)
			return searchInBST(root.right,k);
		else
			return true; 

	}

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		/*
		if (root == null)
			return;  
		if (root.data >= k1 && root.data <= k2) {
			elementsInRangeK1K2(root.left, k1, k2);
			System.out.print(root.data + " "); 
			elementsInRangeK1K2(root.right, k1, k2); 
		} 
		else if (root.data < k1) {
			elementsInRangeK1K2(root.right, k1, k2);
			} 
		else if (root.data > k2) {
			elementsInRangeK1K2(root.left, k1, k2);
		}
		 */
		if (root == null) {
			return;
		}
		if (root.data >= k1 && root.data <= k2) {
			System.out.println(root.data);
		}

		if (root.data > k1) {
			elementsInRangeK1K2(root.left, k1, k2);
		}

		if (root.data <= k2) {
			elementsInRangeK1K2(root.right, k1, k2);
		}


	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MAX_VALUE;

		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));	
	}
	public static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null)
			return Integer.MIN_VALUE;

		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));	
	}	
	public static boolean isBST1(BinaryTreeNode<Integer> root) {

		if(root==null)
			return true;

		int leftMax=maximum(root.left);
		int rightMin=minimum(root.right);

		if(root.data <= leftMax)
			return false;

		if(root.data >=leftMax)
			return false;

		boolean isLeftBST=isBST1(root.left);
		boolean isRightBST=isBST1(root.right);

		if(isLeftBST && isRightBST)
			return true;
		else
			return false;

	}

	public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root){

		if(root==null) {
			Pair<Boolean, Pair<Integer, Integer>> output= new Pair<Boolean, Pair<Integer,Integer>>();
			output.first=true;
			output.second=new Pair<Integer, Integer>();
			output.second.first=Integer.MAX_VALUE;
			output.second.second=Integer.MIN_VALUE;
		}

		Pair<Boolean, Pair<Integer, Integer>> leftOutput=isBST2(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput=isBST2(root.right);

		int min=Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max=Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));

		boolean isBST=(root.data > leftOutput.second.second)
				&& (root.data <=rightOutput.second.first)
				&& leftOutput.first
				&& rightOutput.first;

		Pair<Boolean, Pair<Integer, Integer>> output= new Pair<Boolean, Pair<Integer,Integer>>();
		output.first=isBST;
		output.second=new Pair<Integer, Integer>();
		output.second.first=min;
		output.second.second=max;

		return output;
	}


	public static boolean isBST3(BinaryTreeNode<Integer> root) {
		return isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE); 
	}
	private static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		if(root == null)
			return true;

		if(root.data<min || root.data>max)
			return false;

		boolean isLeftOk=isBST3(root.left, min, root.data-1);
		boolean isRightOk=isBST3(root.right, root.data, max);

		return isLeftOk && isRightOk;
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){

		if (arr.length == 0)
			return null;

		return convertToBST(arr, 0, arr.length - 1);
	}

	private static BinaryTreeNode<Integer> convertToBST(int[] arr, int sI, int eI) {
		if (sI > eI)
			return null;

		int mid = sI + (eI - sI) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
		root.left = convertToBST(arr, sI, mid - 1);
		root.right = convertToBST(arr, mid + 1, eI);
		return root;

	}

	public static LinkedListNode<Integer> addNode(BinaryTreeNode<Integer> currBSTNode, LinkedListNode<Integer> currLLNode) {
		LinkedListNode<Integer> newNode = new LinkedListNode<>(currBSTNode.data);
		currLLNode.next = newNode;
		return newNode;
	} 
	public static LinkedListNode<Integer> helper(BinaryTreeNode<Integer> currBSTNode, LinkedListNode<Integer> currLLNode) {
		if (currBSTNode == null)
			return currLLNode; 

		if (currBSTNode.left != null) 
			currLLNode = helper(currBSTNode.left, currLLNode);

		currLLNode = addNode(currBSTNode, currLLNode);

		if (currBSTNode.right != null) 
			currLLNode = helper(currBSTNode.right, currLLNode);

		return currLLNode;
	} 
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if (root == null) 
			return null;

		LinkedListNode<Integer> head = new LinkedListNode<>(root.data);
		helper(root, head); 

		return head.next; 
	}

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){

		if(root==null)
			return null;

		if(root.data==data) {
			ArrayList<Integer> output=new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}

		if(data<root.data) {
			ArrayList<Integer> leftOutput=getPath(root.left, data);
			if(leftOutput!=null) {
				leftOutput.add(root.data);
				return leftOutput;
			}
		}

		if(data>root.data) {
			ArrayList<Integer> rightOutput=getPath(root.right, data);
			if(rightOutput!=null) {
				rightOutput.add(root.data);
				return rightOutput;
			}
		}

		return null;
	}

	static void pairSum(BinaryTreeNode<Integer> root, int sum) {

		BinaryTreeNode<Integer> originalRoot = root;
		if (root == null){
			return;
		}
		if (root.data !=Integer.MIN_VALUE){
			int temp = root.data;
			root.data = Integer.MIN_VALUE;
			boolean isFound = find(originalRoot, sum - temp);
			if (isFound){
				if (temp < sum - temp){
					System.out.println(temp+" "+(sum-temp)+"\n");
				}
				else{
					System.out.println((sum - temp)+" "+temp+"\n");
				}
			}
		}
		pairSum(root.left, sum);
		pairSum(root.right, sum);

	}

	static boolean find(BinaryTreeNode<Integer> root, int x){
		if (root == null)
			return false;

		if (root.data == x){
			root.data = Integer.MIN_VALUE;
			return true;
		}
		
		return find(root.left, x) || find(root.right, x);
	}   

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
		helper(root,k,"");
	    }
		
	    private static void helper(BinaryTreeNode<Integer> root,int k,String s){
	        if(root==null)
	            return;
	        if(root.left==null && root.right==null && root.data==k)
	        {
	            System.out.println(s+root.data);
	            return;
	        }
	        s=s+root.data+" ";

	        helper(root.left,k-root.data,s);
	        helper(root.right,k-root.data,s);
            

	}
	    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
			// Write your code here
		if (root==null)
	            return 0;
	        
	        if (isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE))
	            return findHeight(root);
	        else
	        {
	        	return Math.max(largestBSTSubtree(root.left),largestBSTSubtree(root.right));
	        }
	            
		}
	    
	    private static int findHeight(BinaryTreeNode<Integer> root)
	    {
	        if (root==null)
	            return 0;
	        
	        if (root.left==null && root.right==null)
	            return 1;
	        
	        return Math.max(findHeight(root.left),findHeight(root.right))+1;
	    }
	    
	    private static boolean isBST(BinaryTreeNode<Integer> root, int min, int max)
	    {
	        if(root == null)
				return true;
			
	        if(root.data < min || root.data > max)
				return false;
			else
				return isBST(root.left,min,root.data -1) && isBST(root.right,root.data +1,max);
	    }
	    
	    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
			// Write your code here
		helper(root,0);

		}
	    public static int helper(BinaryTreeNode<Integer> root,int sum) {

			if(root==null) {
				return 0;
			}
			int sumOfGreaterNodes = helper(root.right,sum);
			int temp = root.data;
			root.data += sumOfGreaterNodes + sum;
			int leftSum  = helper(root.left,root.data);
			return temp + leftSum+ sumOfGreaterNodes ;
		}

} 
