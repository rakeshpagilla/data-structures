package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakesh at Apr 18, 2018 3:04:13 PM
 * Given a binary tree, return all root-to-leaf paths.
 */
public class BinaryTreePaths {
	
	public static void main(String[] a){
		BTreeNode root = new BTreeNode(1);
		root.left = new BTreeNode(2);
		root.right = new BTreeNode(3);
		root.right.right = new BTreeNode(5);
		BinaryTreePaths p = new BinaryTreePaths();
		List<String> res = p.getPaths(root);
		for(String r :res)
			System.out.println(r);
	}
	
	List<String> getPaths(BTreeNode root){
		
		List<String> paths = new ArrayList<String>();
		String s = "";
		helper(root,paths, s);
		return paths;
	}
//Think abt string properties when you concatenate. new object is created
	private void helper(BTreeNode root, List<String> paths, String s) {
		if(root == null)
			return;
		
		s = s + "->" + root.data;
		if(root.left == null && root.right == null){
			paths.add(s.substring(2));
			return;
		}
		if(root.left != null){
			helper(root.left,paths,s);
		}
		if(root.right != null){
			helper(root.right,paths,s);
		}
	}

}
