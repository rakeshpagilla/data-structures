package com.rakesh.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by rakesh at Apr 12, 2018 11:13:39 AM
 */
public class LevelOrderTraservalReverse {
	
	public static void main(String[] a){
		BTreeNode bt = new BTreeNode(30);
		bt.left = new BTreeNode(10);
		bt.left.left= new BTreeNode(5);
		bt.left.right = new BTreeNode(7);
		
		bt.right= new BTreeNode(45);
		bt.right.left = new BTreeNode(27);
		bt.right.right = new BTreeNode(50);
		LevelOrderTraservalReverse l = new LevelOrderTraservalReverse();
		l.printLevelOrderReverse(bt);
	}
	
	
	void printLevelOrderReverse(BTreeNode root){
		
		if(root == null)
			return;
		
		Queue<BTreeNode> q = new LinkedList<BTreeNode>();
		Stack<BTreeNode> s = new Stack<BTreeNode>();
		
		q.offer(root);
		
		while(!q.isEmpty()){
			root = q.poll();
			if(root.right != null)
				q.offer(root.right);
			if(root.left != null)
				q.offer(root.left);
			s.push(root);
		}
		while(!s.isEmpty())
			System.out.print(s.pop().data + " ");
	}

}
