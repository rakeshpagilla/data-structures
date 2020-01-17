package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 16, 2018 10:55:56 AM
 * Given a binary tree, find the maximum path sum. 
 * The path may start and end at any node in the tree. 
 * For example, given the below binary tree

       1
      / \
     2   3
the result is 6.
 */
public class BinaryTreeMaximumPathSum {

	int maxPath(BTreeNode root, int[] max) {

		if (root == null)
			return 0;

		int leftMax = maxPath(root.left, max);
		int rightMax = maxPath(root.right, max);

		int currentMax = Math.max(root.data,Math.max(root.data + leftMax, root.data + rightMax));
		max[0] = Math.max(max[0],Math.max(currentMax, leftMax + root.data + rightMax));
		return currentMax;
	}
}
