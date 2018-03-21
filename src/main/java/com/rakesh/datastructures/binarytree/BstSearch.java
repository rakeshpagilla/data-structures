package com.rakesh.datastructures.binarytree;

/**
 * Created by rakesh at Mar 23, 2017 8:17:07 AM Search in Binary Search Tree.
 	int data;
	BTreeNode left,right;
 */
public class BstSearch {

	private static boolean searchElem(BTreeNode node, int num) {
		if(node == null){
			return false;
		} 
		
		if(num == node.data){
			return true;
		}else if(num < node.data){
			return searchElem(node.left, num);
		}else {
			return searchElem(node.right, num);
		}
	}

	public static void main(String[] args){
		BTreeNode node = new BTreeNode(20);
		BTreeNode lNode = new BTreeNode(10);
		BTreeNode llNode = new BTreeNode(5);
		BTreeNode rNode = new BTreeNode(23);
		BTreeNode lrNode = new BTreeNode(22);
		BTreeNode rrNode = new BTreeNode(25);
		rNode.left = lrNode;
		rNode.right = rrNode;
		node.right = rNode;
		node.left = lNode;
		lNode.left = llNode;
		System.out.println(searchElem(node,22));
	/*	BTreeNode n = searchElem(node,55);
		System.out.println(node.data);
		try{
		assert n.data == 78;
		}catch(AssertionError e){
			System.out.println("Error");
		}*/

	}
}
