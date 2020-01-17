package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakesh at Apr 20, 2018 12:15:29 PM
 * Given a binary tree, collect a tree's nodes as if you were doing this: 
 * Collect and remove all leaves, repeat until the tree is empty.
 *        1
         / \
        2   3
       / \     
      4   5    
Returns [4, 5, 3], [2], [1]
 */
public class FindLeavesOfBinaryTree {
	
	public static void main(String[] a){
		BTreeNode root = new BTreeNode(1);
		root.left = new BTreeNode(2);
		root.right = new BTreeNode(3);
		root.left.left = new BTreeNode(4);
		root.left.right = new BTreeNode(5);
		new FindLeavesOfBinaryTree().findLeaves(root);
	}

	void findLeaves(BTreeNode root) {
		List<List<Integer>> leavesList = new ArrayList<>();
		helper(root, leavesList);
		for(List<Integer> lists: leavesList){
			for(Integer a : lists){
				System.out.print(a  + " ");
			}
			System.out.println();
		}
	}

	private Integer helper(BTreeNode root, List<List<Integer>> list) {
		// TODO Auto-generated method stub
		if (root == null)
			return -1;

		int lHeight = helper(root.left, list);
		int rHeight = helper(root.right, list);
		int maxHeight = Math.max(lHeight, rHeight) + 1;

		// Every index of the outer list is considered as height of a node. On index 0, all
		// the leaves at height 0 are recorded.
		//The below statement is true when maxheight is 0 since the tree is bottom up parsed.
		if (list.size() <= maxHeight) {
			list.add(new ArrayList<>());
		}
		list.get(maxHeight).add(root.data);
		return maxHeight;
	}
}

