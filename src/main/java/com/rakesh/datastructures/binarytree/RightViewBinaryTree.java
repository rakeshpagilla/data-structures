package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by rakesh at Apr 17, 2018 8:24:11 AM
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom. For example, given the following binary tree,

   1            <---
 /   \
2     3         <---
 \     
  5             <---
You can see [1, 3, 5].
 */
public class RightViewBinaryTree {
	
	List<BTreeNode> list = new ArrayList<BTreeNode>();
	

	

	List<Integer> getRightView(BTreeNode root, List<Integer> list) {

		Deque<BTreeNode> q = new LinkedList<BTreeNode>();
		q.addLast(root);

		while (!q.isEmpty()) {
			int size = q.size();
			new Stack();

			for (int i = 0; i < size; i++) {
				BTreeNode top = q.removeFirst();
				if (i == 0)
					list.add(top.data);

				if (top.right != null)
					q.addLast(top.right);

				if (top.left != null)
					q.addLast(top.left);
			}
		}
		return list;
	}
}
