package binarySearchTree;

import binaryTree.Node;

public class LinkedListNode<T> {
	
	T data;
	LinkedListNode<T> next;
	LinkedListNode<T> tail;
	
	LinkedListNode(T data){
		this.data=data;
		next=null;
		tail=null;
	}

}
