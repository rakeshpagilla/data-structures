package com.rakesh.datastructures.binarytree;

/**
 * Created by rakesh at Apr 15, 2018 10:41:36 PM
 * 
 * Given a binary tree, find the length of the longest consecutive sequence
 * path. The path refers to any sequence of nodes from some starting node to any
 * node in the tree along the parent-child connections.
 * https://www.youtube.com/watch?v=r2Vn6ztdSP0&t=863s
 */
public class LongestConsecutiveSequence {

	int longestConsecutive(BTreeNode root) {
		if (root == null)
			return 0;
		return max(consecutive(root.left, root.data, 1),
				consecutive(root.right, root.data, 1));
	}

	private Integer consecutive(BTreeNode node, Integer prev, int length) {

		if(node == null)
			return length;
		
		if(node.data == prev + 1){
			Integer lLength = consecutive(node.left, node.data, length + 1);
			Integer rLength = consecutive(node.right, node.data, length + 1);
			return Math.max(lLength, rLength);
		}else{
			Integer lLength = consecutive(node.left, node.data, 1);
			Integer rLength = consecutive(node.right, node.data, 1);
			return max(lLength, rLength,length);
		}
	}
	
	Integer max(Integer...vals){
		Integer max = Integer.MIN_VALUE;
		for(Integer i : vals){
			if(i > Integer.MIN_VALUE)
				max = i;
		}
		return max;
	}
}
