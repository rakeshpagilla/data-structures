package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;

/*Given a binary tree and a number, return true if the tree has a root-to-leaf path such that adding up all the 
values along the path equals the given number. Return false if no such path can be found.
Also print all the path nodes which lead to the sum;
*/
public class RootToLeafPathSum {

	public static void main(String[] a) {

		BTreeNode tree = new BTreeNode(10);
		tree.left = new BTreeNode(8);
		tree.right = new BTreeNode(2);
		tree.left.left = new BTreeNode(3);
		tree.left.right = new BTreeNode(5);
		tree.right.left = new BTreeNode(9);

		//System.out.println(hasPathToSum(tree, 21));

		printNodesToSumPath(tree, 21, new ArrayList<Integer>());

	}
	
	private static void printNodesToSumPath(BTreeNode root, int sum, ArrayList<Integer> path) {

		if (root == null)
			return;

		path.add(root.data);

		int diff = sum - root.data;

		if (diff == 0 && root.left == null && root.right == null) {
			printList(path);
			return;
		}

		if (root.left != null) {
			printNodesToSumPath(root.left, diff, path);
		}

		if (root.right != null) {
			printNodesToSumPath(root.right, diff, path);
		}
	}

	private static boolean hasPathToSum(BTreeNode root, int sum) {

		if (root == null)
			return sum == 0;

		boolean flag = false;
		int diff = sum - root.data;

		if (diff == 0 && root.left == null && root.right == null)
			return true;

		if (root.left != null)
			flag = flag || hasPathToSum(root.left, diff);

		if (root.right != null)
			flag = flag || hasPathToSum(root.right, diff);

		return flag;
	}

	private static void printList(ArrayList<Integer> data) {

		for (int e : data)
			System.out.print(e + ",");
		
		System.out.println("");

	}
}
