package com.rakesh.datastructures.binarytree;

import java.util.LinkedList;

/**
 * Created by rakesh at Apr 17, 2018 2:12:37 PM
 * One way to serialize a binary tree is to use pre-order traversal. 
 * When we encounter a non-null node, we record the node's value. 
 * If it is a null node, we record using a sentinel value such as #.

      9
    /   \
   3     2
  / \   / \
 4   1  #  6
/ \ / \   / \
# # # #   # #
For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.
 */
public class VerifyPreorderSerialization {
	
	public static void main(String[] a){
		VerifyPreorderSerialization vp = new VerifyPreorderSerialization();
		System.out.println(vp.isValidSerialization("2,#,#"));
		System.out.println(vp.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
		System.out.println(vp.isValidSerialization("2,#,#,#"));
	}

	public boolean isValidSerialization(String preorder) {
		LinkedList<String> stack = new LinkedList<String>();

		String[] a = preorder.split(",");

		for (int i = 0; i < a.length; i++) {

			stack.add(a[i]);
			
			while(stack.size() >=3 &&
				stack.get(stack.size()-1).equals("#")	&&
				stack.get(stack.size()-2).equals("#") &&
				!stack.get(stack.size()-3).equals("#")){
				
				stack.remove(stack.size()-1);
				stack.remove(stack.size()-1);
				stack.remove(stack.size()-1);
				
				stack.add("#");
			}
		}
		if(stack.size() == 1 && stack.get(0).equals("#"))
			return true;
		else
			return false;
	}
}
