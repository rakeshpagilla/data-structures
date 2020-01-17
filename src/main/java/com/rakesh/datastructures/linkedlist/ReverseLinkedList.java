package com.rakesh.datastructures.linkedlist;

/**
 * Created by rakesh at Apr 29, 2018 9:41:16 PM
 */
public class ReverseLinkedList<T>{

	ListNode<T> reverseList(ListNode<T> root){
		
		if(root == null)
			return null;
		ListNode<T> prev = null,next = null;
		
		while(root != null){
			next = root.next;
			root.next = prev;
			prev = root;
			root= next;
		}
		return prev;
	}
}
