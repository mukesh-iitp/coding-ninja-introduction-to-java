package binaryTree;

public class BinaryTreeUse {

	public static void main(String[] args) {
		/*		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(1);
		BinaryTreeNode<Integer> node1=new BinaryTreeNode<>(2);
		root.left=node1;
		BinaryTreeNode<Integer> node2=new BinaryTreeNode<>(3);
		root.right=node2;
		BinaryTreeMethods.printBinaryTreeRecursively(root);
		*/
		
		BinaryTreeNode<Integer> root=BinaryTreeMethods.takeInputLevelWise();
		//BinaryTreeMethods.printBinaryTreeRecursively(root);
		BinaryTreeMethods.printBinaryTreeLevelWise(root);
		System.out.println("Count of nodes:"+BinaryTreeMethods.countNodes(root));
		System.out.println("Sum of nodes:"+BinaryTreeMethods.getSumOfNodes(root));
		System.out.println("Is node present:"+BinaryTreeMethods.isNodePresent(root,2));
		System.out.println("Largest Node:"+BinaryTreeMethods.largestNode(root));
		System.out.println("Count Nodes greater than X:"+BinaryTreeMethods.countNodesGreaterThanX(root,3));
		System.out.println("Height of Binary Tree:"+BinaryTreeMethods.heightOfBinaryTree(root));
		System.out.println("No of Leafs:"+BinaryTreeMethods.noOfLeafNodes(root));
		System.out.print("No node at a depth:");
		BinaryTreeMethods.printNodesAtDepthK(root,2);
		System.out.println();
		System.out.println("Tree after removing leaf nodes:");
		BinaryTreeNode<Integer> newRoot=BinaryTreeMethods.removeLeafNodes(root);
		BinaryTreeMethods.printBinaryTreeLevelWise(newRoot);
		System.out.print("Nodes witout siblings:");
		BinaryTreeMethods.printNodesWithoutSibling(newRoot);
		System.out.println();
		System.out.println("Is binary tree balanced: "+BinaryTreeMethods.isBinaryTreeBalanced(newRoot));
		System.out.println("Is binary tree balanced(Better method call): "+BinaryTreeMethods.isBinaryTreeBalancedBetter(newRoot).isBalanced);
		System.out.println("Diameter of tree:"+BinaryTreeMethods.diameterOfBinaryTree(newRoot));
		System.out.println("Diameter of tree(Better method call):"+BinaryTreeMethods.diameterOfBinaryTreeBetter(newRoot).diameter);
		System.out.print("In order traversal:");
		BinaryTreeMethods.inorderTraversal(newRoot);
		System.out.println();
		int inOrder[]= {4,2,5,1,3,7};
		int preOrder[]= {1,2,4,5,3,7};
		BinaryTreeNode<Integer> buildTree=BinaryTreeMethods.buildTreePre(inOrder, preOrder);
		BinaryTreeMethods.printBinaryTreeLevelWise(buildTree);
		
		System.out.println();
		int inOrder1[]= {2,6,3,9,5,10};
		int postOrder1[]= {2, 9, 3, 6, 10, 5};
		BinaryTreeNode<Integer> buildTree1=BinaryTreeMethods.buildTreePre(inOrder1, postOrder1);
		BinaryTreeMethods.printBinaryTreeLevelWise(buildTree1);
		
		System.out.println("Minimum and Maximum nodes:"+BinaryTreeMethods.getMinAndMax(buildTree1).minimum+","+BinaryTreeMethods.getMinAndMax(buildTree1).maximum);
		
	}
	
}
