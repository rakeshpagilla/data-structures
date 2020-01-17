package com.rakesh.datastructures.binarytree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by rakesh at Apr 15, 2018 11:27:38 PM Given a binary tree, find its
 * minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
 */
public class MinimumDepth {

	Integer minDepth(BTreeNode root) {
		Deque<BTreeNode> nodeq = new LinkedList<BTreeNode>();
		Deque<Integer> countq = new LinkedList<Integer>();
		nodeq.addLast(root);
		countq.addLast(1);

		while (!nodeq.isEmpty()) {
			BTreeNode node = nodeq.removeFirst();
			Integer count = countq.removeFirst();

			if (node.left == null && node.right == null)
				return count;

			if (node.left != null) {
				nodeq.addLast(root.left);
				countq.addLast(count + 1);
			}
			if (node.right != null) {
				nodeq.addLast(node.right);
				countq.addLast(count + 1);
			}
		}
		return 0;
	}

}
