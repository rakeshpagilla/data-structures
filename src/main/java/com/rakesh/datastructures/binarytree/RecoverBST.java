package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 18, 2018 3:32:36 PM
 * Two elements of a binary search tree (BST) are swapped by mistake. 
 * Recover the tree without changing its structure.
 */
public class RecoverBST {
	
	BTreeNode pre;
	BTreeNode first;
	BTreeNode second;

	public void recoverTree(BTreeNode root){
		if(root == null)
			return;
		
		inOrder(root);
		
		if(first != null && second != null){
			int temp = first.data;
			first.data = second.data;
			second.data = temp;
		}
	}

	private void inOrder(BTreeNode root) {
		
		if(root == null)
			return;
		
		inOrder(root.left);
		
		if(pre == null){
			pre = root;
		}else{
			if(root.data < pre.data){
				if(first == null)
					first = pre;
				second = root;
			}
			pre = root;
		}
		inOrder(root.right);
	}
}
