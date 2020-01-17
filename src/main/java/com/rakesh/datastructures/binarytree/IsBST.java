package com.rakesh.datastructures.binarytree;

/**
 * Created by rakesh at Apr 11, 2018 9:21:23 PM
 * https://www.youtube.com/watch?v=MILxfAbIhrE&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu&index=8
 */
public class IsBST {

	public boolean isBst(BTreeNode root, Integer min, Integer max) {

		if (root == null)
			return true;

		if (root.data <= min || root.data > max)
			return false;

		return isBst(root.left, min, root.data)
				&& isBst(root.right, root.data, max);
	}

	public static void main(String[] a){
		BTreeNode root = new BTreeNode(10);
		root.left = new BTreeNode(-10);
		root.left.left = new BTreeNode(-20);
		root.left.right = new BTreeNode(0);
		//root.left.right = new BTreeNode(20); Failure case
		root.right= new BTreeNode(19);
		root.right.left = new BTreeNode(17);
		IsBST is = new IsBST();
		System.out.println(is.isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
}
