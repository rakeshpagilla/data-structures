package com.rakesh.datastructures.binarytree;

/**
 * Created by rakesh at Apr 11, 2018 12:22:56 PM
 */
public class SameTree {

	public boolean isSameTree(BTreeNode p, BTreeNode q) {
		if (p == null && q == null)
			return true;

		if ((p == null || q == null))
			return false;

		return p.data == q.data && isSameTree(p.left, q.left)
				&& isSameTree(p.right, q.right);
	}
}
