package com.rakesh.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rakesh at Apr 12, 2018 2:53:37 PM
 * Video link - https://youtu.be/7uG0gLDbhsI
 * 
 * Given a binary tree print each level on new line.
 * 
 * e.g           10
 *           5         15
 *         0   -1    2    6
 * Output :   10
 *            5 15
 *            0 -1 2 6
 * * Solution
 * Technique 1:
 * Use 2 queue. Keep polling from q1 and offer to q2 till q1 is empty. 
 * After that print a new line. Keep polling from q2 and offer to q1 
 * till q2 is empty. Keep doing this still both q1 and q2 are empty.
 * 
 * Technique 2
 * Use one queue with delimiter. Add a delimiter null after every level.
 * As soon as you encounter a null print a new line and add null at end of queue
 * 
 * Technique 3
 * Use one queue with count. Keep count of nodes at every level. As soon as this 
 * count is 0 print a new line.
 * 
 * Time space complexity for all above algorithm is O(n).
 */
public class LevelByLevelTreeTraversal {
	
	public static void main(String[] a){
		BTreeNode bt = new BTreeNode(30);
		bt.left = new BTreeNode(10);
		bt.left.left= new BTreeNode(5);
		bt.left.right = new BTreeNode(7);
		
		bt.right= new BTreeNode(45);
		bt.right.left = new BTreeNode(27);
		bt.right.right = new BTreeNode(50);
		LevelByLevelTreeTraversal l = new LevelByLevelTreeTraversal();
		l.levelByLevel(bt);
	}

	void levelByLevel(BTreeNode root) {

		Queue<BTreeNode> q = new LinkedList<>();
		int currentCount = 0, levelCount = 1;
		q.offer(root);
		while (!q.isEmpty()) {
			while (levelCount > 0) {
				root = q.poll();
				if (root.left != null) {
					currentCount++;
					q.offer(root.left);
				}

				if (root.right != null) {
					currentCount++;
					q.offer(root.right);
				}
				System.out.print(root.data + " ");
				levelCount--;
			}
			System.out.println();
			levelCount = currentCount;
			currentCount = 0;
		}
	}
	

}
