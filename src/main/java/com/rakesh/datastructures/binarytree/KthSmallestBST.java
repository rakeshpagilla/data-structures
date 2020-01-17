package com.rakesh.datastructures.binarytree;

import java.util.Stack;

/**
 * Created by rakesh at Apr 15, 2018 9:27:33 PM
 */
public class KthSmallestBST {
	
	public static void main(String[] a){
		BTreeNode root = new BTreeNode(10);
		root.left = new BTreeNode(-10);
		root.left.left = new BTreeNode(-20);
		root.left.right = new BTreeNode(0);
		root.right= new BTreeNode(19);
		root.right.left = new BTreeNode(17);
		KthSmallestBST k = new KthSmallestBST();
		System.out.println(k.kThSmallest(root, 4));
	}

	public Integer kThSmallest(BTreeNode root, int k){
		Stack<BTreeNode> stack = new Stack<BTreeNode>();
		
		BTreeNode p = root;
		int result = 0 ;
		while(!stack.isEmpty() || p != null){
			if(p!= null){
				stack.push(p);
				p = p.left;
			}else{
				BTreeNode node = stack.pop();
				if(--k == 0){
					result= node.data;
					break;
				}
				p = node.right;
			}
		}
		return result;
	}
}
