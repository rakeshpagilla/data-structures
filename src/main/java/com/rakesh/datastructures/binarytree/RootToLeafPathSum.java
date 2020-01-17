package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;


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

		ArrayList<BTreeNode> list = new ArrayList<BTreeNode>();
		System.out.println(hasPathToSum(tree, 21,list));
		printList(list);
	}

	private static boolean hasPathToSum(BTreeNode root, int sum,
			List<BTreeNode> list) {

		if(root == null)
			return false;
		if(root.data == sum && root.left == null && root.right == null){
			list.add(root);
			return true;
		}
		
		if(hasPathToSum(root.right, sum-root.data,list) || hasPathToSum(root.left, sum-root.data,list)){
			list.add(root);
			return true;
		}
		return false;
	}

	private static void printList(ArrayList<BTreeNode> data) {

		for (BTreeNode e : data)
			System.out.print(e.data + ",");

		System.out.println("");

	}
}
