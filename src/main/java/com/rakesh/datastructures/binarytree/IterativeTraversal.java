package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
/**
 * Created by rakesh at Apr 10, 2018 4:29:49 PM
 */
import java.util.List;

public class IterativeTraversal {

	private static List<Integer> preorderIter(BTreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		if (root == null)
			return list;

		Deque<BTreeNode> stack = new LinkedList<BTreeNode>();
		stack.addFirst(root);

		while (!stack.isEmpty()) {

			BTreeNode node = stack.removeFirst();
			list.add(node.data);

			if (node.right != null)
				stack.addFirst(node.right);

			if (node.left != null)
				stack.addFirst(node.left);
		}
		return list;
	}

	private static List<Integer> InorderIter(BTreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		Deque<BTreeNode> stack = new LinkedList<BTreeNode>();

		BTreeNode p = root;

		while (!stack.isEmpty() || p != null) {
			if (p != null) {
				stack.addFirst(p);
				p = p.left;
			} else {
				BTreeNode top = stack.removeFirst();
				list.add(top.data);
				p = top.right;
			}
		}
		return list;

	}

	// https://www.youtube.com/watch?v=qT65HltK2uE - Tushar

	private static List<Integer> postOrderIter(BTreeNode root) {

		Deque<BTreeNode> s1 = new LinkedList<BTreeNode>();
		Deque<BTreeNode> s2 = new LinkedList<BTreeNode>();

		s1.addFirst(root);

		while (!s1.isEmpty()) {
			BTreeNode top = s1.removeFirst();
			s2.addFirst(top);
			if (top.left != null)
				s1.addFirst(top.left);
			if (top.right != null)
				s1.addFirst(top.right);
		}

		List<Integer> result = new ArrayList<Integer>();
		while (!s2.isEmpty())
			result.add(s2.removeFirst().data);
		return result;
	}
}
