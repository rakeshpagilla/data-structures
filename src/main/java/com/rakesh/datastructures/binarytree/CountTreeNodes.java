package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 18, 2018 1:04:08 PM
 * https://www.programcreek.com/2014/06/leetcode-count-complete-tree-nodes-java/
 * Given a complete binary tree, count the number of nodes.
 */
public class CountTreeNodes {
	
	public static void main(String[] a){
		BTreeNode root = new BTreeNode(1);
		root.left = new BTreeNode(2);
		root.right = new BTreeNode(3);
		root.right.right = new BTreeNode(5);
		System.out.println(new CountTreeNodes().countNodes(root));
	}

	Integer countNodes(BTreeNode root) {

		if (root == null)
			return 0;

		int lHeight = getLeftHeight(root) ;
		int rHeight = getRightHeight(root) ;

		if (lHeight == rHeight) {
			return (2 << (lHeight)) - 1;
		} else {
			return countNodes(root.left) + countNodes(root.right) + 1;
		}
	}

	private int getLeftHeight(BTreeNode n) {

		int height = 0;
		while (n.left != null) {
			n = n.left;
			height++;
		}
		return height;
	}

	private int getRightHeight(BTreeNode n) {

		int height = 0;
		while (n.right != null) {
			n = n.right;
			height++;
		}
		return height;
	}
}
