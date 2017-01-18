package com.rakesh.datastructures.binarytree;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 *You are given a pointer to the root of a binary tree. Print the top view of the binary tree. 
You only have to complete the function. 
For example :

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Top View : 1 -> 5 -> 3 -> 2 -> 7

Sample Input

     3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
Sample Output

1 5 3 2 7
       1
      /   \
    2       3
      \   
        4  
          \
            5
             \
               6
Top view of the above binary tree is
2 1 3 6
 * */

public class TopViewTree {

	public static void main(String[] a) {
		
		BTreeNode root = new BTreeNode(1);
        root.left = new BTreeNode(2);
        root.right = new BTreeNode(3);
        root.left.right = new BTreeNode(4);
        root.left.right.right = new BTreeNode(5);
        root.left.right.right.right = new BTreeNode(6);
        TopViewTree t = new TopViewTree();
        System.out.println("Following are nodes in top view of Binary Tree");
        t.printTopView(root);

	}

	public void printTopView(BTreeNode root) {

		Queue<QItem> queue = new LinkedList<QItem>();
		HashSet<Integer> set = new HashSet<Integer>();
		queue.add(new QItem(root, 0));

		while (!queue.isEmpty()) {

			QItem qitem = queue.remove();
			int hd = qitem.distance;

			if (!set.contains(hd)) {
				set.add(hd);
				System.out.println(qitem.node.data);
			}

			if(qitem.node.left != null)
				queue.add(new QItem(qitem.node.left, hd-1));
			
			if(qitem.node.right != null)
				queue.add(new QItem(qitem.node.right, hd+1));
		}
	}

	class QItem {
		BTreeNode node;
		int distance;

		public QItem(BTreeNode node, int distance) {
			this.node = node;
			this.distance = distance;
		}
	}

}
