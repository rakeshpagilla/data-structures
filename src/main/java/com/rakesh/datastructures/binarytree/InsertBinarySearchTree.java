package com.rakesh.datastructures.binarytree;

public class InsertBinarySearchTree {

	public static BTreeNode insertNode(BTreeNode root, int value) {

		if (root == null)
			return new BTreeNode(value);

		if (root.data > value)
			root.left = insertNode(root.left, value);

		if (root.data < value)
			root.right = insertNode(root.right, value);

		return root;
	}
}
