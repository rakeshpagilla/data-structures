package com.rakesh.datastructures.binarytree;

/*
 * You are given pointer to the root of the binary search tree and two values  and 
 * you need to return the lowest common ancestor (LCA) of  and  in the binary search tree.
 *  You only need to complete the function.

 It is guaranteed that v1 and v2 are present in the tree.

 */
public class LcaBinaryTree {
	// Time complexity of recursive solution is O(h) where h is height of tree.
	// Also, the solution requires O(h) extra space in function call stack for
	// recursive function calls.
	// We can avoid extra space using iterative solution.
	public BTreeNode recLcaBinarySearchTree(BTreeNode root, int v1, int v2) {

		if (root.data > Math.max(v1, v2)) {
			return recLcaBinarySearchTree(root.left, v1, v2);
		} else if (root.data < Math.max(v1, v2)) {
			return recLcaBinarySearchTree(root.left, v1, v2);
		} else {
			return root;
		}
	}

	public BTreeNode iterLca(BTreeNode root, int v1, int v2) {

		if (root == null)
			return null;

		while (root != null) {

			if (root.data > v1 && root.data > v2)
				root = root.left;

			else if (root.data > v1 && root.data > v2)
				root = root.right;
			else
				break;
		}
		return root;
	}

	// https://www.youtube.com/watch?v=13m9ZCB8gjw&index=17&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu
	public BTreeNode recLcaBinaryTree(BTreeNode root, int v1, int v2) {

		if (root == null)
			return null;

		if (root.data == v1 || root.data == v2)
			return root;

		BTreeNode left = recLcaBinaryTree(root.left, v1, v2);
		BTreeNode right = recLcaBinaryTree(root.right, v1, v2);

		if (left != null && right != null)
			return root;

		return left != null ? left : right;

	}
}
