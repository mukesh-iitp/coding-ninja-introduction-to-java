package binarySearchTree;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;


	private BinaryTreeNode<Integer> insertHelper(int data, BinaryTreeNode<Integer> root) {

		if(root==null)
			return new BinaryTreeNode<Integer>(data);

		if(data <= root.data){
			//insert on left subtree
			root.left = insertHelper(data, root.left);
		}
		else{
			//insert on right subtree
			root.right = insertHelper(data, root.right);
		}

		return root;
	}

	public void insertData(int data) {

		root = insertHelper(data, root);
	}

	private BinaryTreeNode<Integer> deleteHelper(int data, BinaryTreeNode<Integer> root) {

		if(root==null)
			return null;

		if(data < root.data){
			root.left = deleteHelper(data, root.left);
			return root;
		}else if(data > root.data){
			root.right = deleteHelper(data, root.right);
			return root;
		}else{ //data = root.data
			if(root.left == null && root.right == null){
				return null;
			}else if(root.left == null){
				return root.right;
			}else if(root.right == null){
				return root.left;
			}else{
				//if both left and right are not null, pick minimum element from right subtree and make that as the root
				BinaryTreeNode<Integer> minNode = root.right;
				while(minNode.left!=null){
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteHelper(minNode.data, root.right);
				
				return root; 
			}
		}
	}

	public void delete(int data) {

		root = deleteHelper(data, root);
	}


	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {

		if(root==null)
			return false;
		if(root.data==data)
			return true;
		else if(data>root.data)
		{
			//call right
			return hasDataHelper(data, root.right);
		}
		else
		{
			//call left
			return hasDataHelper(data, root);
		}

	}

	public 	boolean hasData(int data) {

		return hasDataHelper(data, this.root);
	}

	private void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + ":";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}

		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}

	public void printTree() {
		printTree(root);
	}


}
