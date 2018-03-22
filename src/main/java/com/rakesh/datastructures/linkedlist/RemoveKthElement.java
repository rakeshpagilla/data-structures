package com.rakesh.datastructures.linkedlist;

/**
 * Created by rakesh at Mar 20, 2018 9:37:15 PM
 * Given a linked list, remove the nth node from the end of list and return its head.

For example, given linked list 1->2->3->4->5 and n = 2, the result is 1->2->3->5.
 */
public class RemoveKthElement {

	public static ListNode<Integer> removeKthNode(ListNode<Integer> head, int n) {

		ListNode<Integer> fast = head;
		ListNode<Integer> slow = head;
		
		for(int i=0 ; i < n ; i++){
			fast = fast.next;
		}
		
		if(fast == null){// I/P [1,2] , n =2 ; [1] n =1;
			head = head.next;
			return head;
		}
		
		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		return head;
	}

}
