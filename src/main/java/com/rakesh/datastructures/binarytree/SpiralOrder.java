package com.rakesh.datastructures.binarytree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://github.com/mission-peace/interview/blob/master/src/com/interview/tree/TreeTraversalInSpiralOrder.java
 * Created by rakesh at Apr 12, 2018 12:15:09 AM
 * https://www.youtube.com/watch?v=
 * vjt5Y6-1KsQ&list=PLrmLmBdmIlpv_jNDXtJGYTPNQ2L1gdHxu&index=15
 */
public class SpiralOrder {
	
	public static void main(String[] args){
		BTreeNode bt = new BTreeNode(30);
		bt.left = new BTreeNode(10);
		bt.left.left= new BTreeNode(5);
		bt.left.right = new BTreeNode(7);
		
		bt.right= new BTreeNode(45);
		bt.right.left = new BTreeNode(27);
		bt.right.right = new BTreeNode(50);
		SpiralOrder sp = new SpiralOrder();
		sp.printSpiral(bt);
	}

	public void printSpiral(BTreeNode root) {

		Deque<BTreeNode> d = new LinkedList<BTreeNode>();
		d.add(null);
		d.addFirst(root);
		
		while(d.size() > 1){
			root = d.getFirst();
			while(root != null){
				root = d.removeFirst();
				System.out.println(root.data);
				if(root.left != null)
					d.addLast(root.left);
				if(root.right != null)
					d.addLast(root.right);
				root = d.getFirst();
			}
			
			root = d.getLast();
			while(root != null){
				root = d.removeLast();
				System.out.println(root.data);
				if(root.right != null)
					d.addFirst(root.right);
				if(root.left != null)
					d.addFirst(root.left);
				root = d.getLast();
			}
		}
	}
}
