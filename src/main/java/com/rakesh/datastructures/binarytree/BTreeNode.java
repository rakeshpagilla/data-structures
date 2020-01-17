package com.rakesh.datastructures.binarytree;

class BTreeNode {

	Integer data;
	BTreeNode left, right;

	BTreeNode next;

	Integer lis;
	Integer height;
	Integer size;

	BTreeNode(int item) {
		data = item;
		left = right = null;
	}

	BTreeNode() {
	}

	public static BTreeNode newNode(int data) {
		BTreeNode n = new BTreeNode();
		n.left = null;
		n.right = null;
		n.data = data;
		n.lis = -1;
		n.height = 1;
		n.size = 1;
		return n;
	}

	public BTreeNode addNode(int data, BTreeNode head) {
		BTreeNode tempHead = head;
		BTreeNode n = BTreeNode.newNode(data);
		if (head == null) {
			head = n;
			return head;
		}
		BTreeNode prev = null;
		while (head != null) {
			prev = head;
			if (head.data < data) {
				head = head.right;
			} else {
				head = head.left;
			}
		}
		if (prev.data < data) {
			prev.right = n;
		} else {
			prev.left = n;
		}
		return tempHead;
	}

}
