package com.rakesh.datastructures.binarytree;
//Write a program to Calculate Size of a tree
// http://www.geeksforgeeks.org/write-a-program-to-calculate-size-of-a-tree/
public class SizeOfTree {

	public static void main(String[] a){
		
	}
	
	public int sizeOfTree(BTreeNode root){
		
		if(root == null)
			return 0;
		
		return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
	}
}
