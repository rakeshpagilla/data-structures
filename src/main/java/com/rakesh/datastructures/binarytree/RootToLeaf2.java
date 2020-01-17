package com.rakesh.datastructures.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rakesh at Apr 10, 2018 9:18:39 AM
 * 
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return
[
   [5,4,11,2],
   [5,8,4,5]
]
Analysis
This problem can be converted to be a typical depth-first search problem. A recursive
depth-first search algorithm usually requires a recursive method call, a reference to
the final result, a temporary result, etc.

 */
public class RootToLeaf2 {

	public static void main(String[] a){
		BTreeNode tree = new BTreeNode(10);
		tree.left = new BTreeNode(8);
		tree.right = new BTreeNode(2);
		tree.left.left = new BTreeNode(3);
		tree.left.right = new BTreeNode(5);
		tree.right.left = new BTreeNode(9);
		
		new RootToLeaf2().pathSum(tree,21);
	}
	public List<ArrayList<Integer>> pathSum(BTreeNode root, int sum) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(root == null) 
	        return result;
	 
	    ArrayList<Integer> l = new ArrayList<Integer>();
	    l.add(root.data);
	    dfs(root, sum-root.data, result, l);
	    return result;
	}
	 
	public void dfs(BTreeNode t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> l){
	    if(t.left==null && t.right==null && sum==0){
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        temp.addAll(l);
	        result.add(temp);
	    }
	 
	    //search path of left node
	    if(t.left != null){
	        l.add(t.left.data);
	        dfs(t.left, sum-t.left.data, result, l);
	        System.out.println("Left Node " + t.data + " size" + l.size());
	        l.remove(l.size()-1);
	    }
	 
	    //search path of right node
	    if(t.right!=null){
	        l.add(t.right.data);
	        dfs(t.right, sum-t.right.data, result, l);
	        System.out.println("Right Node " + t.data + " size" + l.size());
	        l.remove(l.size()-1);
	    }
	}
	
}
