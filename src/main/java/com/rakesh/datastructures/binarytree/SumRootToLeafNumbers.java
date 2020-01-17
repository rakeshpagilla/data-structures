package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 18, 2018 10:27:18 AM
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *  Find the total sum of all root-to-leaf numbers.
 *  1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.
Return the sum = 12 + 13 = 25.
 */
public class SumRootToLeafNumbers {
	
	public static void main(String[] a){
		SumRootToLeafNumbers o = new SumRootToLeafNumbers();
		BTreeNode root = new BTreeNode(1);
		root.left = new BTreeNode(2);
		root.right = new BTreeNode(3);
		root.right.left = new BTreeNode(5);
		System.out.println(o.dfs(root));
	}
	
	Integer dfs(BTreeNode root){
		if(root == null)
			return 0;
		return dfs(root, 0 );
	}

	private Integer dfs(BTreeNode root, int num) {

		if(root == null)
			return 0;
		
		num = num * 10 + root.data;
		
		if(root.left == null && root.right == null){
			return num;
		}
		
		return dfs(root.left, num) + dfs(root.right, num);
	}

}
