package com.rakesh.datastructures.binarytree;
/**
 * Created by rakesh at Apr 18, 2018 1:32:48 PM
 * Given a non-empty binary search tree and a target value, 
 * find the value in the BST that is closest to the target.
 */
public class ClosestBinaryTreeValue {
	
	double min = Integer.MAX_VALUE;
	Integer goal;
	
	void closesVal(BTreeNode root, double target){
		
		if(root == null){
			return;
		}
		
		if(Math.abs(target-root.data) < min){
			goal = root.data;
			min = Math.abs(target-root.data);
		}
		
		if(target < root.data){
			closesVal(root.left,target);
		}else{
			closesVal(root.right,target);
		}
	}
}
