package com.rakesh.datastructures.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public static void main(String[] a){
		BTreeNode tree = new BTreeNode(10);
		tree.left = new BTreeNode(8);
		tree.right = new BTreeNode(2);
		tree.left.left = new BTreeNode(3);
		tree.left.right = new BTreeNode(5);
		tree.right.left = new BTreeNode(9);
		printInLevelOrder(tree);
	}
	
	
	public static void printInLevelOrder(BTreeNode root){
		
		if(root == null)
			return; 
		
		
		Deque<BTreeNode> queue = new LinkedList<BTreeNode>();
		queue.addLast(root);
		
		while(!queue.isEmpty()){
			
			BTreeNode tempNode  = queue.removeFirst();
			
			if(tempNode.left != null){
				queue.addLast(tempNode.left);
			}
			
			if(tempNode.right != null){
				queue.addLast(tempNode.right);
			}
		}
	}

}
