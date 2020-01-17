package com.rakesh.datastructures.binarytree;

/**
 * Created by rakesh at Apr 25, 2018 2:03:10 PM Given a binary tree, determine
 * if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 */
public class BalancedTree {

	boolean checkBalanced(BTreeNode root) {
		if (root == null)
			return true;

		if (findHeight(root) == -1) {
			return false;
		}
		return true;
	}

	private int findHeight(BTreeNode root) {
		if (root == null)
			return 0;

		int left = findHeight(root.left);
		int right = findHeight(root.right);

		if (left == -1 || right == -1)
			return -1;

		if (Math.abs(left - right) > 1)
			return -1;

		return 1 + Math.max(left, right);
	}
}
