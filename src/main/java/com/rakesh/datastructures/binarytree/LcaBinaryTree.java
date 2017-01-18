package com.rakesh.datastructures.binarytree;

/*
 * You are given pointer to the root of the binary search tree and two values  and . You need to return the lowest common ancestor (LCA) of  and  in the binary search tree. You only need to complete the function.

It is guaranteed that v1 and v2 are present in the tree.


Sample Input

         4
       /   \
      2     7
     / \   /
    1   3 6
 and .

Sample Output

LCA of  and  is  (which is the root). 
Return a pointer to the root in this case.
 */
public class LcaBinaryTree {
	// Time complexity of recursive solution is O(h) where h is height of tree.
	// Also, the solution requires O(h) extra space in function call stack for
	// recursive function calls.
	// We can avoid extra space using iterative solution.
	public BTreeNode recLca(BTreeNode root, int v1, int v2) {

		if (root == null)
			return null;

		if (root.data > v1 && root.data > v2)
			return recLca(root.left, v1, v2);

		if (root.data < v1 && root.data < v2)
			return recLca(root.right, v1, v2);

		return root;

	}

	public BTreeNode iterLca(BTreeNode root, int v1, int v2) {

		if (root == null)
			return null;


		while (root != null) {

			if (root.data > v1 && root.data > v2)
				root = root.left;

			else if (root.data > v1 && root.data > v2)
				root = root.right;
			else
				break;
		}

		return root;

	}

}
