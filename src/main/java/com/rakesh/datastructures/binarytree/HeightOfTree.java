package com.rakesh.datastructures.binarytree;
/*
 * "The height of a tree is the length of the path from the root to the deepest node in the tree. 
 * A (rooted) tree with only a node (the root) has a height of zero." 
If there is no node, you want to return -1 not 0. This is because you are adding 1 at the end.
So if there isn't a node, you return -1 which cancels out the +1.
 */
public class HeightOfTree {

	public static void main(String[] a) {
		BTreeNode node = new BTreeNode(1);
		node.left = new BTreeNode(2);
		node.right = new BTreeNode(3);
		node.left.left = new BTreeNode(4);
		System.out.println(maxDepth(node));
	}

	private static int maxDepth(BTreeNode root) {
		
		if(root == null)
			return -1;
		
		int lLen = maxDepth(root.left);
		int rLen = maxDepth(root.right);
		return Math.max(rLen, lLen)+1;
	}
}
