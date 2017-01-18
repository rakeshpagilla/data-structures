package com.rakesh.datastructures.binarytree;

public class HeightOfTree {

	public static void main(String[] a) {

	}

	private static int maxDepth(BTreeNode root) {
		
		if(root == null)
			return -1;
		
		int lLen = maxDepth(root.left);
		int rLen = maxDepth(root.right);
		
		if(lLen > rLen)
			return lLen+1;
		else
			return rLen+1;
	}
}
