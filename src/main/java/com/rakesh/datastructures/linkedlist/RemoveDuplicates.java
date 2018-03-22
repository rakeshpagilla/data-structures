package com.rakesh.datastructures.linkedlist;

/**
 * Created by rakesh at Mar 20, 2018 10:17:08 PM Given a sorted linked list,
 * delete all duplicates such that each element appear only once.For example,
 * Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicates {

	public static ListNode<Integer> removeDuplicates(ListNode<Integer> head) {

		ListNode<Integer> temp = head;

		while(temp != null){
			ListNode<Integer> n = temp.next;
			while(n != null && n.data == temp.data){
				n = n.next;
			}
			
			temp.next = n;
			temp = n;
		}
		
		return head;
	}
}
