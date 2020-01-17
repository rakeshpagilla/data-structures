package com.rakesh.datastructures.binarytree;

import java.util.Stack;

import org.w3c.dom.Node;

/**
 * Created by rakesh at Apr 16, 2018 10:29:28 PM
 */
public class BSTIterator {

	Stack<BTreeNode> stack;

	public BSTIterator(BTreeNode root) {
		stack = new Stack<BTreeNode>();
		if (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}

	public int next() {
		BTreeNode node = stack.pop();
		int result = node.data;
		if (node.right != null) {
			node = node.right;
			while (node != null) {
				stack.push(node);
				node = node.left;
			}
		}
		return result;
	}
}
