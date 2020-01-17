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

	public static BTreeNode iterInsertNode(BTreeNode root, int val) {

		BTreeNode node = new BTreeNode(val);
		BTreeNode current = root, prev = null;

		while (current != null) {
			prev = current;
			if (val > current.data) {
				current = current.right;
			} else {
				current = current.left;
			}
		}
		if (prev.data > val) {
			prev.left = node;
		} else {
			prev.right = node;
		}
		return root;
	}
}
