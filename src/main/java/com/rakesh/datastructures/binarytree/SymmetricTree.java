package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 16, 2018 9:47:40 PM
 * Given a binary tree, 
 * check whether it is a mirror of itself 
 * For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 */
public class SymmetricTree {

	Boolean isSymmetric(BTreeNode root) {

		return root == null || checkSymmetric(root.left, root.right);
	}

	private boolean checkSymmetric(BTreeNode n1, BTreeNode n2) {

		if (n1 == null && n2 == null)
			return true;
		else if (n1 != null && n2 != null) {
			return n1.data == n2.data && checkSymmetric(n1.left, n2.right)
					&& checkSymmetric(n1.right, n2.left);
		}
		return false;
	}
}
