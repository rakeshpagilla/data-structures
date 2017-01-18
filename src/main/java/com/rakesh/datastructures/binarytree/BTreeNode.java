package com.rakesh.datastructures.binarytree;

class BTreeNode {
	
	int data;
	BTreeNode left,right;
	
	BTreeNode(int item) 
    {
        data = item;
        left = right = null;
    }

}
