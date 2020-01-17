package com.rakesh.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rakesh at Apr 13, 2018 3:04:16 PM
 */
public class InvertTree {

	BTreeNode recInvertTree(BTreeNode root) {
		if (root != null)
			recInvert(root);
		return root;
	}

	void recInvert(BTreeNode root) {

		BTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left != null)
			recInvert(root.left);
		if(root.right != null)
			recInvert(root.right);
	}
	
	BTreeNode iterInvertTree(BTreeNode root){
		Queue<BTreeNode> q = new LinkedList<BTreeNode>();
		if(root != null)
			q.offer(root);
		
		while(!q.isEmpty()){
			BTreeNode p = q.poll();
			if(p.left != null)
				q.offer(p.left);
			if(p.right != null)
				q.offer(p.right);
			BTreeNode temp = p.left;
			p.left = p.right;
			p.right = temp;
		}
		return root;
	}
}
